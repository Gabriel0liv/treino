package ti.treino.ex2.resource;

import java.time.LocalDate;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import ti.treino.ex2.model.ApiMessage;
import ti.treino.ex2.model.LoanRequest;

@Path("/loans")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoanResource {

    @POST
    public Response registerLoan(LoanRequest request) {
        // TODO 1: validar se request, livro, leitor e emprestimo não são null.

        // TODO 2: validar ISBN com regex de 13 dígitos.
        // Exemplo: valor.matches("\\d{13}")

        // TODO 3: validar número de estudante com 7 dígitos.

        // TODO 4: validar email contendo @.

        // TODO 5: validar data prevista de devolução como data futura.
        // Dica: LocalDate.parse(...).isAfter(LocalDate.now())

        // Por enquanto, devolve sempre Created para a base compilar.
        return Response.status(Response.Status.CREATED)
                .entity(new ApiMessage("Empréstimo registado com sucesso"))
                .build();
    }

    private Response badRequest(String message) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ApiMessage(message))
                .build();
    }
}
