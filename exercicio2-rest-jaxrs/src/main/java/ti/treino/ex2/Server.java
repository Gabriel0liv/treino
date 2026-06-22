package ti.treino.ex2;

import java.net.URI;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import ti.treino.ex2.resource.LoanResource;

public class Server {
    public static void main(String[] args) throws Exception {
        URI baseUri = URI.create("http://localhost:8001/");

        ResourceConfig config = new ResourceConfig();
        config.register(LoanResource.class);
        config.packages("ti.treino.ex2");

        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
        System.out.println("REST ativo em http://localhost:8001/loans");
        server.join();
    }
}
