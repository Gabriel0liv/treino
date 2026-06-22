package ti.treino.ex3.client;

public class SoapReaderClient {

    // No treino, vamos decidir juntos uma das duas abordagens:
    // 1. Gerar cliente a partir do WSDL.
    // 2. Criar pedido SOAP manualmente.
    // O material de apoio recomenda bibliotecas/frameworks porque montar SOAP manual é mais propenso a erros.

    public ReaderData getReaderByIsbn(String isbn) {
        // TODO: implementar consumo do SOAP da questão 1.
        throw new UnsupportedOperationException("TODO: consumir SOAP da questão 1");
    }

    public static class ReaderData {
        public String nomeLeitor;
        public String numeroEstudante;
        public String email;
        public String tituloLivro;
        public String autor;
        public String editora;
        public int anoPublicacao;
        public String isbn;
    }
}
