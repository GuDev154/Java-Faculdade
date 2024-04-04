package Somativa01;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

class Livro{

    String titulo;
    String autor;
    int anoPublicacao;

    public Livro (String newTitulo, String newAutor, int newAnoPublicacao){
        this.titulo = newTitulo;
        this.autor = newAutor;
        this.anoPublicacao = newAnoPublicacao;
    }


    @Override
    public String toString(){
        return titulo + ", " + autor + ", " + anoPublicacao+".";
    }

}

public class Main {
    public static void main(String[] args) {
    LinkedList<Livro> livrosBiblioteca = new LinkedList<>();
    }
}
