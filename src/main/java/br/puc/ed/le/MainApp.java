package br.puc.ed.le;

public class MainApp {

    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.inserirNoInicio(new Aeroporto("LDB", "Londrina"));
        listaEncadeada.inserirNoFim(new Aeroporto("VCP", "Campinas"));
        listaEncadeada.inserirNoFim(new Aeroporto("BPS", "Porto Seguro"));
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoInicio(new Aeroporto("MGF", "Maringá"));
        listaEncadeada.imprimirTodos();
        listaEncadeada.inserirNoFim(new Aeroporto("SSA", "Salvador"));
        listaEncadeada.imprimirTodos();
        Node noExcluido = listaEncadeada.excluirNoInicio();
        System.out.println("O aeroporto " + noExcluido.getAeroporto().getCodigo()
            + " foi excluído com sucesso!");
        listaEncadeada.imprimirTodos();
    }
}
