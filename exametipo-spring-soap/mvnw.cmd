@echo off
setlocal enabledelayedexpansion

set MAVEN_VERSION=3.9.9
set MAVEN_BASE=%USERPROFILE%\.m2\wrapper\dists\apache-maven-%MAVEN_VERSION%
set MAVEN_HOME=%MAVEN_BASE%\apache-maven-%MAVEN_VERSION%
set MAVEN_ZIP=%MAVEN_BASE%\apache-maven-%MAVEN_VERSION%-bin.zip
set MAVEN_URL=https://archive.apache.org/dist/maven/maven-3/%MAVEN_VERSION%/binaries/apache-maven-%MAVEN_VERSION%-bin.zip

if not exist "%MAVEN_HOME%\bin\mvn.cmd" (
    echo Maven %MAVEN_VERSION% nao encontrado localmente.
    echo A descarregar Maven para: %MAVEN_BASE%
    mkdir "%MAVEN_BASE%" 2>nul
    powershell -NoProfile -ExecutionPolicy Bypass -Command "[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; Invoke-WebRequest -Uri '%MAVEN_URL%' -OutFile '%MAVEN_ZIP%'"
    if errorlevel 1 (
        echo.
        echo Erro ao descarregar Maven. Verifica a ligacao a internet ou instala Maven manualmente.
        exit /b 1
    )
    echo A extrair Maven...
    powershell -NoProfile -ExecutionPolicy Bypass -Command "Expand-Archive -Path '%MAVEN_ZIP%' -DestinationPath '%MAVEN_BASE%' -Force"
    if errorlevel 1 (
        echo.
        echo Erro ao extrair Maven.
        exit /b 1
    )
)

call "%MAVEN_HOME%\bin\mvn.cmd" %*
