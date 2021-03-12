package br.puc.ed.le;

public class Node {
    protected String chaveAeroporto;
    protected String nomeCidade;
    protected Node proximo;

    public Node(String chaveAeroporto, String nomeCidade){
        proximo = null;
        this.chaveAeroporto = chaveAeroporto;
        this.nomeCidade = nomeCidade;
    }

    public String getChaveAeroporto() {
        return chaveAeroporto;
    }

    public void setChaveAeroporto(String chaveAeroporto) {
        this.chaveAeroporto = chaveAeroporto;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Node{" +
            "chaveAeroporto='" + chaveAeroporto + '\'' +
            ", nomeCidade='" + nomeCidade + '\'' +
            '}';
    }
}
