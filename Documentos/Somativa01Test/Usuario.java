package Somativa01Test;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Usuario {
    String nomeUsuario;
    Stack<Livro> historicoDeNavegacao;
    Queue<Livro> filaDeEspera;


    public Usuario(String newUsuario){
        this.nomeUsuario = newUsuario;
        historicoDeNavegacao = new Stack<>();
        filaDeEspera = new LinkedList<>();
    }

    //Metodos de Historico de navegação

    public void adicionarAoHistorico(Livro Livro){
        historicoDeNavegacao.push(Livro);
    }

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
    }

    //Metodo de emprestimo de livro(Este metodo (Adiciona o livro emprestado) vai retornar para o metodo de busca (O proximo livro) e ele vai sugerir o livro para o usuario)
}
