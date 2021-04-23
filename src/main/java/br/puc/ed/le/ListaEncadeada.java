package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;
    private Integer qtdElementos;

    public ListaEncadeada(){
        inicio = null;
    }

    public void inserirNoInicio(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            fim = novoNo;
        }
        novoNo.proximo = inicio;
        inicio = novoNo;
        qtdElementos++;
    }

    public void inserirNoFim(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            inicio = novoNo;
        }
        fim.proximo = novoNo;
        fim = novoNo;
        qtdElementos++;
    }

    public Node excluirDoInicio(){
        Node noExcluido = inicio;
        inicio = inicio.proximo;
        qtdElementos--;
        return noExcluido;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void imprimirTodos(){
        Node noAtual = inicio;
        while (noAtual != null){
            System.out.print(noAtual.getAeroporto() + " -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }

    public Node getInicio() {
        return inicio;
    }

    public Node getFim() {
        return fim;
    }

    /**
     * Exercício 6
     */
    public Node getPenultimoNo(){
        Node node = inicio;
        while (node != null){
            if(node.proximo == fim){
                return node;
            }
            node = node.proximo;
        }
        return null;
    }

    /**
     * Exercício 7
     */
    public void inserirAposAeroporto(String codigo, Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        Node noAtual = inicio;
        while (noAtual != null){
            if(noAtual.getAeroporto().getCodigo().equals(codigo)){
                novoNo.proximo = noAtual.proximo;
                noAtual.proximo = novoNo;
                break;
            }
            noAtual = noAtual.proximo;
        }
    }

    public int getQtdElementos() {
        return qtdElementos;
    }
}
