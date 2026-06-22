# Exercício 2 — REST com JAX-RS

Porta: `8001`

Endpoint sugerido:

`POST http://localhost:8001/loans`

## Como correr

```bash
mvn compile exec:java
```

## Como testar com curl

```bash
curl -X POST http://localhost:8001/loans \
  -H "Content-Type: application/json" \
  -d '{
    "livro": {"isbn": "9789727229051", "titulo": "Integração de Sistemas", "autor": "Autor Teste"},
    "leitor": {"nome": "Ana Silva", "numeroEstudante": "1234567", "email": "ana@ua.pt"},
    "emprestimo": {"dataLevantamento": "2026-06-15", "dataPrevistaDevolucao": "2026-06-30", "tipoEmprestimo": "normal"}
  }'
```

## Ordem de resolução

1. Ver `LoanRequest.java` para perceber o JSON.
2. Completar as validações em `LoanResource.java`.
3. Devolver `400 Bad Request` quando algo estiver inválido.
4. Devolver `201 Created` quando o registo for aceite.
