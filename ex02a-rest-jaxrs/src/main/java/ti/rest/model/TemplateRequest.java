package ti.rest.model;

/*
 * Esta classe representa o JSON recebido no endpoint REST.
 * Para cada exercício, troca estes campos pelos campos do enunciado.
 *
 * Exemplo JSON para este template:
{
  "numeroMicrochip": "123456789012345",
  "telefone": "912345678",
  "data": "2026-07-10",
  "hora": "14:30",
  "tipoConsulta": "Rotina"
}
 */
public class TemplateRequest {
    private String numeroMicrochip;
    private String telefone;
    private String data;
    private String hora;
    private String tipoConsulta;

    public void setNumeroMicrochip( String numeroMicrochip){
        this.numeroMicrochip = numeroMicrochip;
    }

    public String getNumeroMicrochip(){
        return numeroMicrochip;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public String getHora(){
        return hora;
    }

    public void setTipoConsulta( String tipoConsulta){
        this.tipoConsulta = tipoConsulta;
    }

    public String getTipoConsulta(){
        return tipoConsulta;
    }

}
