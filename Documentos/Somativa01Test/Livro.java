package Somativa01Test;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String novoTitulo, String novoAutor, int novoAnoPublicacao){
        this.titulo = novoTitulo;
        this.autor = novoAutor;
        this.anoPublicacao = novoAnoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public String toString(){
        return titulo + ", " + autor + ", " + anoPublicacao+"";
    }


}
