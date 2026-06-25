package ti.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.*;

import ti.soap.schema.*;;


@Endpoint
public class TemplateEndpoint {

    /*
    Para cada exercício:
    1. Completar o XSD em src/main/resources/META-INF/schemas/service.xsd
    2. Executar: .\mvnw.cmd clean compile
    3. Importar as classes geradas de ti.soap.schema
    4. Criar o método com:
       @PayloadRoot(namespace = NAMESPACE_URI, localPart = "nomeDoRequest")
       @ResponsePayload
       public ClasseResponse metodo(@RequestPayload ClasseRequest request) { ... }
    */

    @PayloadRoot(namespace = "http://example.com/service", localPart = "getEncomendaRequest")
    @ResponsePayload
    public GetEncomendaResponse getEncomenda(@RequestPayload GetEncomendaRequest request) {

        GetEncomendaResponse response = new GetEncomendaResponse();

        response.setNumeroEncomenda(request.getNumeroEncomenda());
        response.setDataEncomenda("amanha");
        response.setEstado("a caminho");
        response.setMoradaEntrega("sua casa");
        response.setNomeCliente("gabriel oliveira");
        response.setProduto("teclado");
        response.setQuantidade("1");
        response.setEmail("gabr@oliveira.pt");
        

        return response;

    }
}
