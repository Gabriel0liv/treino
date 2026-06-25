# Template REST JAX-RS

Template base para exercícios REST com Jakarta/JAX-RS, Jersey e Jetty.

## Estrutura

```text
template-rest-jaxrs/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/main/java/ti/rest/
    ├── Server.java
    ├── model/
    │   ├── ApiMessage.java
    │   └── TemplateRequest.java
    └── resource/
        └── TemplateResource.java
```

## Como correr

No PowerShell, dentro da pasta do projeto:

```powershell
.\mvnw.cmd clean compile
.\mvnw.cmd exec:java
```

O servidor arranca em:

```text
http://localhost:8001/
```

Endpoint de teste:

```text
POST http://localhost:8001/template
Content-Type: application/json
```

Body de exemplo:

```json
{
  "codigo": "1234567890",
  "descricao": "exemplo"
}
```

Resposta esperada:

```json
{
  "message": "Pedido processado com sucesso"
}
```

## Como adaptar a um exercício

Normalmente alteras só:

```text
src/main/java/ti/rest/model/TemplateRequest.java
src/main/java/ti/rest/resource/TemplateResource.java
src/main/java/ti/rest/Server.java
```

Em `TemplateResource.java`, os pontos principais são:

```java
@Path("/nome-do-recurso")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Response metodo(ClasseRequest request) { ... }
```

Para validações comuns, podes reutilizar os métodos:

```java
hasText(...)
hasExactDigits(...)
isFutureDateTime(...)
```

## Observação sobre internet/offline

O `mvnw.cmd` só funciona offline se o Maven e as dependências já estiverem na cache local `.m2` do computador. Para simular modo exame, depois de compilar uma vez com internet, testa:

```powershell
.\mvnw.cmd -o clean compile
```
