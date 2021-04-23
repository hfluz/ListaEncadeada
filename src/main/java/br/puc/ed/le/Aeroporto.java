package br.puc.ed.le;

public class Aeroporto {
    private String codigo;
    private String nomeCidade;

    public Aeroporto(String codigo, String nomeCidade){
        this.codigo = codigo;
        this.nomeCidade = nomeCidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    @Override
    public String toString() {
        return "(" + codigo + ", " + nomeCidade + ") ";
    }
}
