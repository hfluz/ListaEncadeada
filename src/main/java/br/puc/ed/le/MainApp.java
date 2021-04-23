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
        Node noExcluido = listaEncadeada.excluirDoInicio();
        System.out.println("Nó excluído: " + noExcluido + "\n");
        listaEncadeada.imprimirTodos();
        Node inicio = listaEncadeada.getInicio();
        System.out.println("Início: " + inicio.getAeroporto() + "\n");
        Node fim = listaEncadeada.getFim();
        System.out.println("Fim: " + fim.getAeroporto());
        Node penultimoNo = listaEncadeada.getPenultimoNo();
        System.out.println("Penultimo: " + penultimoNo.getAeroporto());
        listaEncadeada.inserirAposAeroporto("BPS", new Aeroporto("REC", "Recife"));
        listaEncadeada.imprimirTodos();
    }
}
