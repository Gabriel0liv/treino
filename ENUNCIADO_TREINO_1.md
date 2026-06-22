# Exame Treino 1 — Sistema de Biblioteca Universitária

A biblioteca da Universidade pretende desenvolver um sistema de gestão de empréstimos de livros.

## Questão 1 — SOAP com Spring — 50 valores

Implemente um Web Service SOAP que permita consultar os dados de um leitor através do ISBN de um livro.

Pedido:

- ISBN, validado como sequência de 13 dígitos.

Resposta:

- nome do leitor
- número de estudante
- email
- título do livro
- autor
- editora
- ano de publicação
- ISBN

WSDL esperado:

- `http://localhost:8002/services/readers.wsdl`

## Questão 2 — REST com JAX-RS — 40 valores

Implemente um Web Service REST que permita registar o empréstimo de um livro.

JSON recebido:

- Livro: ISBN, título, autor
- Leitor: nome, número de estudante, email
- Empréstimo: data de levantamento, data prevista de devolução, tipo de empréstimo

Validações:

- ISBN: exatamente 13 dígitos
- número de estudante: exatamente 7 dígitos
- email: contém `@`
- data prevista de devolução: futura

## Questão 3 — SOAP com JAX-WS mediador — 80 valores

Implemente um serviço SOAP que recebe ISBN, tipo de empréstimo, data de levantamento e data prevista de devolução.

O serviço deve:

1. consultar os dados do leitor/livro no SOAP da questão 1;
2. registar o empréstimo no REST da questão 2;
3. devolver uma mensagem final com os dados do empréstimo.

## Questão 4 — XSLT — 30 valores

Crie uma folha XSLT que transforme a lista de empréstimos em XML para HTML com uma tabela.
