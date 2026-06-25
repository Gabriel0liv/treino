package ti.rest;

import java.net.URI;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import ti.rest.resource.TemplateResource;

public class Server {
    public static void main(String[] args) throws Exception {
        URI baseUri = URI.create("http://localhost:8001/");

        ResourceConfig config = new ResourceConfig();
        config.register(TemplateResource.class);
        config.packages("ti.rest");

        org.eclipse.jetty.server.Server server = JettyHttpContainerFactory.createServer(baseUri, config);
        System.out.println("REST ativo em http://localhost:8001/template");
        server.join();
    }
}
