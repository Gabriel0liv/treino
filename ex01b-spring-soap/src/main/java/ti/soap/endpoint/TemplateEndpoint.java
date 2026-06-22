package ti.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

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
}
