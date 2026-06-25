package ti.rest.model;

/*
 * Esta classe representa o JSON recebido no endpoint REST.
 * Para cada exercício, troca estes campos pelos campos do enunciado.
 *
 * Exemplo JSON para este template:
 * {
 *   "codigo": "1234567890",
 *   "descricao": "exemplo"
 * }
 */
public class TemplateRequest {
    private String codigo;
    private String descricao;

    public TemplateRequest() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
