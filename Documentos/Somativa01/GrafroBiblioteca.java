package Somativa01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GrafroBiblioteca{
    private Map<Livro, Set<Livro>> adjacencias;

    //Construtor
    public GrafroBiblioteca() {
        this.adjacencias = new HashMap<>();
    }

    // Método para adicionar uma conexão 
    public void adicionarConexao(Livro origem, Livro destino) {
        adjacencias.putIfAbsent(origem, new HashSet<>());
        adjacencias.putIfAbsent(destino, new HashSet<>());
        adjacencias.get(origem).add(destino);
    }

    // Metodo para imprimir as conexões do grafo
    public void imprimirGrafo() {
        System.out.println("Coleções de Livros da Biblioteca:");

        List<Livro> livrosOrdenados = new ArrayList<>(adjacencias.keySet());
        Collections.sort(livrosOrdenados, Comparator.comparing(Livro::getTitulo));

        // Iterando sobre os livros ordenados
        for (Livro livro : livrosOrdenados) {
            Set<Livro> conexoes = adjacencias.get(livro);
            System.out.print(livro.getTitulo() + ": ");
            if (conexoes.isEmpty()) {
                System.out.print("Este livro não possui outras conexões!");
            }
            for (Livro conexao : conexoes) {
                System.out.print(conexao.getTitulo() + ". ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //Metodo de Sugestão de livros
    public void buscarLivroEconexoes(Stack<Livro> livros) {
        for (Livro livro : livros) {
            if (adjacencias.containsKey(livro)) {
                System.out.println("Sugestões de leitura com base no livro " + livro.getTitulo() + ":");
                Set<Livro> conexoes = adjacencias.get(livro);
                for (Livro conexao : conexoes) {
                    System.out.println(conexao);
                }
            } else {
                System.out.println("Livro " + livro.getTitulo() + " não encontrado no grafo.");
            }
            System.out.println("");
        }
    }

    //Metodo para mostrar as distancias entre cada livro
    public void imprimirDistancias(Map<Livro, Integer> distancias, Livro origem) {
        System.out.println("Distâncias a partir do livro de origem "+origem.getTitulo()+":");

        List<Map.Entry<Livro, Integer>> listaDistancias = new ArrayList<>(distancias.entrySet());
        Collections.sort(listaDistancias, Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Livro, Integer> entry : listaDistancias) {
            Livro livro = entry.getKey();
            int distancia = entry.getValue();
            System.out.println(livro.getTitulo() + ": " + distancia);
        }
        System.out.println("");
    }

    //Metodo utilizando Djikstra
    public void verificarDistancia(Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();
    
        distancias.put(origem, 0);
        fila.add(origem);
    
        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);
    
            for (Livro vizinho : adjacencias.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }
        imprimirDistancias(distancias,origem);
    }
   
}
