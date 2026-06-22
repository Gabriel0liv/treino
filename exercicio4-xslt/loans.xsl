<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>
                <title>Lista de Empréstimos</title>
                <style>
                    table { border-collapse: collapse; width: 100%; }
                    th, td { border: 1px solid black; padding: 6px; }
                    th { background-color: #eeeeee; }
                </style>
            </head>
            <body>
                <h1>Lista de Empréstimos</h1>

                <table>
                    <tr>
                        <th>Leitor</th>
                        <th>N.º Estudante</th>
                        <th>Título</th>
                        <th>Autor</th>
                        <th>ISBN</th>
                        <th>Tipo</th>
                        <th>Levantamento</th>
                        <th>Devolução Prevista</th>
                    </tr>

                    <!-- TODO: percorrer todos os emprestimos/emprestimo -->
                    <!-- Dica: <xsl:for-each select="emprestimos/emprestimo"> -->

                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
