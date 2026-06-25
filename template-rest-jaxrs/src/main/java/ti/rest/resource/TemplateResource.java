package ti.rest.resource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import ti.rest.model.ApiMessage;
import ti.rest.model.TemplateRequest;

@Path("/template")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TemplateResource {

    @POST
    public Response create(TemplateRequest request) {
        if (request == null) {
            return badRequest("Pedido JSON inválido ou vazio");
        }

        // Exemplo de validação genérica. Troca pelos campos do teu exercício.
        if (!hasText(request.getCodigo())) {
            return badRequest("O campo codigo é obrigatório");
        }

        return Response.status(Response.Status.CREATED)
                .entity(new ApiMessage("Pedido processado com sucesso"))
                .build();
    }

    private Response badRequest(String message) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ApiMessage(message))
                .build();
    }

    private boolean hasText(String value) {
        return value != null && !value.isBlank();
    }

    private boolean hasExactDigits(String value, int digits) {
        return value != null && value.matches("\\d{" + digits + "}");
    }

    private boolean isFutureDateTime(String date, String time) {
        try {
            LocalDate parsedDate = LocalDate.parse(date);      // esperado: yyyy-MM-dd
            LocalTime parsedTime = LocalTime.parse(time);      // esperado: HH:mm
            LocalDateTime dateTime = LocalDateTime.of(parsedDate, parsedTime);
            return dateTime.isAfter(LocalDateTime.now());
        } catch (Exception e) {
            return false;
        }
    }
}
