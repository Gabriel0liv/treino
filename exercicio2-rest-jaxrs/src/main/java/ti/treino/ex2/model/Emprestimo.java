package ti.treino.ex2.model;

public class Emprestimo {
    private String dataLevantamento;
    private String dataPrevistaDevolucao;
    private String tipoEmprestimo;

    public String getDataLevantamento() { return dataLevantamento; }
    public void setDataLevantamento(String dataLevantamento) { this.dataLevantamento = dataLevantamento; }

    public String getDataPrevistaDevolucao() { return dataPrevistaDevolucao; }
    public void setDataPrevistaDevolucao(String dataPrevistaDevolucao) { this.dataPrevistaDevolucao = dataPrevistaDevolucao; }

    public String getTipoEmprestimo() { return tipoEmprestimo; }
    public void setTipoEmprestimo(String tipoEmprestimo) { this.tipoEmprestimo = tipoEmprestimo; }
}
