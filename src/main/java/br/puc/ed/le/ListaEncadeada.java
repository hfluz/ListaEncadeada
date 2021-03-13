package br.puc.ed.le;

public class ListaEncadeada {
    private Node inicio;
    private Node fim;

    public ListaEncadeada(){
        inicio = null;
        fim = null;
    }

    public void inserirNoInicio(Aeroporto aeroporto){

    }

    public void inserirNoFim(Aeroporto aeroporto){

    }

    public Node excluirNoInicio(){
        return null;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void imprimirTodos(){
        Node noAtual = inicio;
        while (noAtual != null){
            System.out.print(noAtual + ") -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }
}
