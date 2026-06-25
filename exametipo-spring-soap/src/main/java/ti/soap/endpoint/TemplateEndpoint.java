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

    @PayloadRoot(namespace = "http://example.com/service", localPart = "getTutorRequest")
    @ResponsePayload
    public GetTutorResponse getTutor(@RequestPayload GetTutorRequest request) {

        GetTutorResponse response = new GetTutorResponse();

        response.setNumeroMicroship(request.getNumeroMicroship());
        response.setEspecie("pitbull");
        response.setNascimentoAnimal("ano passado");
        response.setNif("123456789");
        response.setNomeAnimal("paçoca");
        response.setRaca("sla a diferença");
        response.setTelefone("915681078");
        response.setNomeTutor("Gabriel Oliveira");

        return response;

    }
}
