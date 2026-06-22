package ti.treino.ex1.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

// Estas classes só existem depois de completares o XSD e executares `mvn compile`.
 import ti.treino.ex1.readers.GetReaderRequest;
 import ti.treino.ex1.readers.GetReaderResponse;

@Endpoint
public class ReaderEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/readers";

    /*
    TODO 4: depois de completares o XSD e gerares as classes JAXB, descomenta e completa.
    */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getReaderRequest")
    @ResponsePayload
    public GetReaderResponse getReader(@RequestPayload GetReaderRequest request) {
        GetReaderResponse response = new GetReaderResponse();

        String isbn = request.getIsbn();

        response.setAutor("carlos");
        response.setNomeLeitor("Ana martins");
        response.setEmail("ana.ma@ua.pt");
        response.setTituloLivro("Introdução aos sistemas de info");
        response.setNumeroEstudante("1234567");
        response.setEditora("editora acad");
        response.setAnoPublicacao(2026);
        response.setIsbn(isbn);
        // TODO: validar ISBN e preencher dados simulados.
        // No exame pode haver dados fixos, uma lista em memória ou uma classe repository já existente.

        return response;
    }
    
}
