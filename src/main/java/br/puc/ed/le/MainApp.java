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
        Integer tamanho = listaEncadeada.getTamanho();
        System.out.println("O tamanho da lista encadeada é " + tamanho);
        Node inicio = listaEncadeada.getInicio();
        System.out.println("Início: " + inicio.getAeroporto().getCodigo());
        Node fim = listaEncadeada.getFim();
        System.out.println("Fim: " + fim.getAeroporto().getCodigo());
    }
}
