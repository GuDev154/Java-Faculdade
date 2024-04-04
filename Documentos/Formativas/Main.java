package Formativas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Livro{

    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String newTitulo, String newAutor, int anoPublicacao){
        this.titulo = newTitulo;
        this.autor = newAutor;
        this.anoPublicacao = anoPublicacao;

    }

    @Override
    public String toString(){
        return titulo + ", " + autor + ", " + anoPublicacao+".";
    }

}

class HistoricoDeNavegacao{
    Stack<Livro> historico;

    public HistoricoDeNavegacao(){
        historico = new Stack<>();
    }

    public void adicionarAoHistorico(Livro Livro){
        historico.push(Livro);
    }

    public void imprimirHistorico(){
        System.out.println("Este é o seu Historico de Navegação:");
        for (Livro livro : historico){
            System.out.println(livro.toString());
        }
    }

}

class FilaDeEspera{
    Queue<Livro> filaDeEspera;

    public FilaDeEspera(){
        filaDeEspera = new LinkedList<>();
    }

    public void adicionarFilaDeEspera(Livro Livro){
        filaDeEspera.add(Livro);
    }

    public void imprimirFilaDeEspera(){
        System.out.println("Este é a sua Fila de Espera:");
        for (Livro livro : filaDeEspera){
            System.out.println(livro.toString());
        }
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList<Livro> listaDeLivros = new LinkedList<>();

        listaDeLivros.add(new Livro("Livro A", "Autor 1", 1996));
        listaDeLivros.add(new Livro("Livro B", "Autor 2", 1984));
        listaDeLivros.add(new Livro("Livro C", "Autor 3", 1956));
        listaDeLivros.add(new Livro("Livro D", "Autor 4", 1979));

        for (Livro elemento : listaDeLivros){
            System.out.println(elemento);
        }

        HistoricoDeNavegacao nossoHistorico = new HistoricoDeNavegacao();
        for (Livro livro : listaDeLivros){
           nossoHistorico.adicionarAoHistorico(livro);
        }
        nossoHistorico.imprimirHistorico();

        
        FilaDeEspera filaTeste = new FilaDeEspera();
        for(Livro livro : listaDeLivros){
            filaTeste.adicionarFilaDeEspera(livro);
        }
        filaTeste.imprimirFilaDeEspera();

        
    }
}
