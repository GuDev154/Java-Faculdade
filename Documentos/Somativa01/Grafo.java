package Somativa01;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Grafo {
    private Map<String, Set<String>> adjacencias;

    //Construtor
    public Grafo() {
        this.adjacencias = new HashMap<>();
    }

    // Método para adicionar uma conexão entre dois nós
    public void adicionarConexao(String origem, String destino) {
        adjacencias.putIfAbsent(origem, new HashSet<>());
        adjacencias.putIfAbsent(destino, new HashSet<>());
        adjacencias.get(origem).add(destino);
    }

    // Método para imprimir as conexões do grafo
    public void imprimirGrafo() {
        System.out.println("Conexões no Grafo:");
        for (Map.Entry<String, Set<String>> entry : adjacencias.entrySet()) {
            String no = entry.getKey();
            Set<String> conexoes = entry.getValue();
            System.out.print(no + ": ");
            for (String conexao : conexoes) {
                System.out.print(conexao + " ");
            }
            System.out.println();
        }
    }
}