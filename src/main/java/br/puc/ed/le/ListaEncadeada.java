package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;

    public ListaEncadeada(){
        inicio = null;
        fim = null;
    }

    public void inserirNoInicio(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            fim = novoNo;
        }
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public void inserirNoFim(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            inicio = novoNo;
        }
        fim.proximo = novoNo;
        fim = novoNo;
    }

    public Node excluirNoInicio(){
        Node noExcluido = inicio;
        inicio = inicio.proximo;
        return noExcluido;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void imprimirTodos(){
        Node noAtual = inicio;
        while (noAtual != null){
            System.out.print(noAtual + " -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }
}
