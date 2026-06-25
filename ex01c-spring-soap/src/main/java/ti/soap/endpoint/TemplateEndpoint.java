package ti.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

import org.springframework.ws.server.endpoint.annotation.*;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

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


@PayloadRoot(namespace = "http://example.com/service", localPart = "getConsultaRequest")    
@ResponsePayload
public GetConsultaResponse getConsulta(@RequestPayload GetConsultaRequest request){
    GetConsultaResponse response = new GetConsultaResponse();

    response.setNumeroUtente(request.getNumeroUtente());
    response.setNomePaciente("gabriel oliveira");
    response.setMedico("joao nunes");
    response.setEspecialidade("curar");
    response.setDataConsulta("amanha");
    response.setHoraConsulta("é só querer");
    response.setSala("é só querer");
    response.setEstado("é só querer");



    return response;
}

}
