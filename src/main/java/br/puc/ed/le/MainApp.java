package br.puc.ed.le;

public class MainApp {

    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        listaEncadeada.adicionarNoInicio("LDB", "Londrina");
        listaEncadeada.adicionarNoInicio("VCP", "Campinas");
        listaEncadeada.adicionarNoInicio("BPS", "Porto Seguro");
        listaEncadeada.imprimirTodos();
        listaEncadeada.adicionarNoInicio("MGF", "Maringá");
        listaEncadeada.imprimirTodos();
        listaEncadeada.adicionarNoInicio("SSA", "Salvador");
        listaEncadeada.imprimirTodos();
        Node noExcluido = listaEncadeada.excluirDoInicio();
        listaEncadeada.imprimirTodos();
    }
}
