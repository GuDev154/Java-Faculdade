package Somativa01;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Usuario {
    String nomeUsuario;
    Stack<Livro> historicoDeNavegacao;
    Queue<Livro> filaDeEspera;


    public Usuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
        historicoDeNavegacao = new Stack<>();
        filaDeEspera = new LinkedList<>();
    }

    //Metodos de Historico de navegação
    public void adicionarAoHistorico(Livro Livro){
        historicoDeNavegacao.push(Livro);
    }

    //Metodo retorna os livros do historico para o metodo de busca de sugestão
    public Stack<Livro> retornaHistorico(){
        return historicoDeNavegacao;
    }

    //Imprime o historico na tela
    public void imprimirHistorico(){
        System.out.println("Este é o seu Historico de Navegação:");
        for (Livro livro : historicoDeNavegacao){
            System.out.println(livro.toString());
        }
    }

    //Metodos da Fila de Espera
    public void adicionarFilaDeEspera(Livro Livro){
        filaDeEspera.add(Livro);
    }

    public void imprimirFilaDeEspera(){
        System.out.println("Este é a sua Fila de Espera:");
        for (Livro livro : filaDeEspera){
            System.out.println(livro.toString());
        }
        System.out.println("");
    }

    //Metodo de Emprestar Livro
    public void emprestarLivro(Livro livro){
        System.out.println(nomeUsuario+" emprestou o livro: "+ livro +".");
        System.out.println("");
        historicoDeNavegacao.add(livro);
    }

    //Metodo de Busca de livros utilizando o metodo de busca da classe grafobiblioteca com base no historico de livros
    public void sugerirLivros(GrafroBiblioteca grafo) {
        Stack<Livro> historico = retornaHistorico();
        grafo.buscarLivroEconexoes(historico);
    }
}
