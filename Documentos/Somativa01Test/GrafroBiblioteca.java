package Somativa01Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

//Metodos de adicionar livro no grafo
//Metodos de Busca de Livro no Grafo

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
        System.out.println("Livros e Suas Coleções(Conexões):");
        for (Map.Entry<Livro, Set<Livro>> entry : adjacencias.entrySet()) {
            Livro livro = entry.getKey();
            Set<Livro> conexoes = entry.getValue();
            System.out.print(livro.getTitulo() + ": ");
            for (Livro conexao : conexoes) {
                System.out.print(conexao.getTitulo() + ". ");
            }
            System.out.println();
        }
    }

    //Metodo de Sugestão de livros
    public void buscarLivroEconexoes(Stack<Livro> livros) {
        for (Livro livro : livros) {
            if (adjacencias.containsKey(livro)) {
                System.out.println("Conexões do livro " + livro.getTitulo() + ":");
                Set<Livro> conexoes = adjacencias.get(livro);
                for (Livro conexao : conexoes) {
                    System.out.println(conexao);
                }
            } else {
                System.out.println("Livro " + livro.getTitulo() + " não encontrado no grafo.");
            }
        }
    }

}
