# Exercício 1 — SOAP com Spring-WS

Porta: `8002`

WSDL esperado:

`http://localhost:8002/services/readers.wsdl`

## Como correr

```bash
mvn spring-boot:run
```

## Ordem de resolução

1. Completar `src/main/resources/META-INF/schemas/readers.xsd`.
2. Executar `mvn compile` para gerar classes JAXB.
3. Completar `ReaderEndpoint.java`.
4. Confirmar se o WSDL abre no browser.

## Ficheiros principais

- `readers.xsd`: contrato de entrada/saída.
- `WebServiceConfig.java`: publica o WSDL.
- `ReaderEndpoint.java`: recebe o pedido SOAP e devolve a resposta.
