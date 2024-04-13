package Somativa01;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Adicionando conexões ao grafo
        grafo.adicionarConexao("A", "B");
        grafo.adicionarConexao("A", "C");
        grafo.adicionarConexao("B", "C");
        grafo.adicionarConexao("B", "D");
        grafo.adicionarConexao("C", "D");
        grafo.adicionarConexao("D", "E");
        grafo.adicionarConexao("E", "F");
        grafo.adicionarConexao("F", "A");
        grafo.adicionarConexao("F", "B");

        // Imprimindo o grafo
        grafo.imprimirGrafo();
    }
}
