package ti.treino.ex3.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "ti.treino.ex3.service.FinalLoanService")
public class FinalLoanServiceImpl implements FinalLoanService {

    @Override
    public String registerFinalLoan(String isbn, String tipoEmprestimo, String dataLevantamento, String dataPrevistaDevolucao) {
        // TODO 1: chamar o SOAP da questão 1 para obter dados do leitor/livro pelo ISBN.
        // TODO 2: montar o JSON para o REST da questão 2.
        // TODO 3: chamar o REST da questão 2 para registar o empréstimo.
        // TODO 4: devolver mensagem final com os dados exigidos.

        return "TODO: implementar mediação para ISBN " + isbn;
    }
}
