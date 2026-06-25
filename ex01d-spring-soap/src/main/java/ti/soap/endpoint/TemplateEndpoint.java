package ti.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.*;


import ti.soap.schema.*;

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

    @PayloadRoot(namespace = "http://example.com/service", localPart = "getApoliceRequest" )
    @ResponsePayload
    public GetApoliceResponse getApolice(@RequestPayload GetApoliceRequest request) {

        GetApoliceResponse response = new GetApoliceResponse();

        response.setNumeroApolice(request.getNumeroApolice());
        response.setEstado("ativo");
        response.setMarca("ford");
        response.setMatricula("03-47-KD");
        response.setNif("123456789");
        response.setTipoSeguro("jovem");
        response.setNomeCliente("gabriel Oliveira");

        return response;
    } 

}
