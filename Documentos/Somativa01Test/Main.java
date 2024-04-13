package Somativa01Test;

public class Main {
    public static void main(String[] args) {
        GrafroBiblioteca livrosGrafo = new GrafroBiblioteca();

    Livro livro1 = new Livro("Percy Jacson 1", "Rick Riordan", 2005);
    Livro livro2 = new Livro("Percy Jacson 2", "Rick Riordan", 2005);
    Livro livro3 = new Livro("Percy Jacson 3", "Rick Riordan", 2005);


    
   
    livrosGrafo.adicionarConexao(livro1,livro2);
    livrosGrafo.adicionarConexao(livro1,livro3);
   

    livrosGrafo.imprimirGrafo();

    }
}
