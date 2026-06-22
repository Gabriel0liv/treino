package ti.treino.ex3;

import jakarta.xml.ws.Endpoint;
import ti.treino.ex3.service.FinalLoanServiceImpl;

public class Server {
    public static void main(String[] args) {
        String url = "http://localhost:8000/loans/final";
        Endpoint.publish(url, new FinalLoanServiceImpl());
        System.out.println("SOAP mediador ativo em " + url);
        System.out.println("WSDL: " + url + "?wsdl");
    }
}
