package ti.treino.ex3.client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class RestLoanClient {

    private static final String REST_URL = "http://localhost:8001/loans";

    public String registerLoan(String json) {
        Client client = ClientBuilder.newClient();

        Response response = client.target(REST_URL)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(json, MediaType.APPLICATION_JSON));

        String body = response.readEntity(String.class);
        int status = response.getStatus();
        client.close();

        if (status >= 200 && status < 300) {
            return body;
        }

        throw new RuntimeException("Erro REST " + status + ": " + body);
    }
}
