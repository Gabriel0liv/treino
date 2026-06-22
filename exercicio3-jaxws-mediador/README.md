# Exercício 3 — SOAP com JAX-WS mediador

Porta: `8000`

Endpoint sugerido:

`http://localhost:8000/loans/final`

WSDL gerado pelo JAX-WS:

`http://localhost:8000/loans/final?wsdl`

## Como correr

```bash
mvn compile exec:java
```

## Ordem de resolução

1. Completar a interface `FinalLoanService.java` se o enunciado pedir mais parâmetros.
2. Completar a implementação `FinalLoanServiceImpl.java`.
3. Criar ou completar cliente SOAP para a questão 1.
4. Criar ou completar cliente REST para a questão 2.
5. Montar a mensagem final.

Este projeto está intencionalmente incompleto, porque no exame a maior dificuldade é integrar serviços.
