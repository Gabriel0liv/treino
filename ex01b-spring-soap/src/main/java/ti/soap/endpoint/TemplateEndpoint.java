package ti.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

// ADICIONAR SEMPRE
import org.springframework.ws.server.endpoint.annotation.PayloadRoot; // diz qual XML/pedido este método atende
import org.springframework.ws.server.endpoint.annotation.RequestPayload; // pega o conteúdo do pedido SOAP
import org.springframework.ws.server.endpoint.annotation.ResponsePayload; // transforma o retorno em resposta SOAP

import ti.soap.schema.GetMembroRequest;
import ti.soap.schema.GetMembroResponse;

@Endpoint
public class TemplateEndpoint {

    /*
    Para cada exercício:
    1. Completar o XSD em src/main/resources/META-INF/schemas/service.xsd
    2. Executar: .\mvnw.cmd clean compile
    3. Importar as classes geradas de ti.soap.schema
    4. Criar o método com:
       @PayloadRoot(namespace = NAMESPAC E_URI, localPart = "nomeDoRequest")
       @ResponsePayload
       public ClasseResponse metodo(@RequestPayload ClasseRequest request) { ... }
    */


    private static final String NAMESPACE_URI = "http://example.com/service";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMembroRequest")
    @ResponsePayload
    public GetMembroResponse getMembro(@RequestPayload GetMembroRequest request) {

        GetMembroResponse response = new GetMembroResponse();

        String numeroCartao = request.getNumeroCartao();

        response.setNumeroCartao(numeroCartao);
        response.setDataInicio("21/07/2004");
        response.setEmail("alo@gmail.com");
        response.setEstado("ativo");
        response.setNif("987654321");
        response.setPlano("plano free");
        response.setNomeSocio("gabriel oliveira"); 

        return response;

    }


}
