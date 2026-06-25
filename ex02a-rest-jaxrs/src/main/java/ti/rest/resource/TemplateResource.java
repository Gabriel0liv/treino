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

//import ti.rest.model.ApiMessage;
import ti.rest.model.TemplateRequest;

@Path("/consultas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public class TemplateResource {

    @POST
    public Response agendarConsulta(TemplateRequest request){


        String numeroMicrochip = request.getNumeroMicrochip();
        String data = request.getData();
        String hora = request.getHora();
        String telefone = request.getTelefone();


        if (numeroMicrochip == null || !numeroMicrochip.matches("[0-9]{15}")){
            return Response.status(Response.Status.BAD_REQUEST)
            .entity("número de microchip inválido")
            .build();
        }

        if (telefone == null || !telefone.matches("[0-9]{9}")){
            return Response.status(Response.Status.BAD_REQUEST)
            .entity("telefone errado")
            .build();
        }

        if(data == null || hora == null){
            return Response.status(Response.Status.BAD_REQUEST)
            .entity("Data ou hora vazias")
            .build();
        }

        try {
            LocalDate dataConsulta = LocalDate.parse(data);
            LocalTime horaConsulta = LocalTime.parse(hora);
            LocalDateTime dataHoraConsulta = LocalDateTime.of(dataConsulta, horaConsulta);
            
            if (!dataHoraConsulta.isAfter(LocalDateTime.now())){
                return Response.status(Response.Status.BAD_REQUEST)
                .entity("A data e hora da consulta devem ser futuras")
                .build();
            }


        } catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST)
            .entity("Data ou Hora no formato inválido")
            .build();
        }




        

        return Response.status(Response.Status.CREATED)
        .entity("{\"message\":\"Consulta recebida\"}")
        .build();

    }


}
