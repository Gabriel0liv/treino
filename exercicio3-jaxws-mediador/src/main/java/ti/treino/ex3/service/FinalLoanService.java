package ti.treino.ex3.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface FinalLoanService {

    @WebMethod
    String registerFinalLoan(
            @WebParam(name = "isbn") String isbn,
            @WebParam(name = "tipoEmprestimo") String tipoEmprestimo,
            @WebParam(name = "dataLevantamento") String dataLevantamento,
            @WebParam(name = "dataPrevistaDevolucao") String dataPrevistaDevolucao
    );
}
