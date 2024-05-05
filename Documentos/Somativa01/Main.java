package Somativa01;

public class Main {
    public static void main(String[] args) {
        GrafroBiblioteca livrosGrafo = new GrafroBiblioteca();

        //Criando os Livros(Representei os titulos com numeros para ser mais facil de visualizar as conexoes)
        Livro livro1 = new Livro("Percy Jackson 1", "Rick Riordan", 2005);
        Livro livro2 = new Livro("Percy Jackson 2", "Rick Riordan", 2006);
        Livro livro3 = new Livro("Percy Jackson 3", "Rick Riordan", 2007);

        Livro livro4 = new Livro("As cronicas de Narnia 1", "C. S. Lewis",1950);
        Livro livro5 = new Livro("As cronicas de Narnia 2", "C. S. Lewis",1951);
        Livro livro6 = new Livro("As cronicas de Narnia 3", "C. S. Lewis",1952);
        Livro livro7 = new Livro("As cronicas de Narnia 4", "C. S. Lewis",1953);

        Livro livro8 = new Livro("Game of Thrones 1", "George R. R. Martin",1996);
        Livro livro9 = new Livro("Game of Thrones 2", "George R. R. Martin",1998);
        Livro livro10 = new Livro("Game of Thrones 3", "George R. R. Martin",2000);
        Livro livro11 = new Livro("Game of Thrones 4", "George R. R. Martin",2005);
        Livro livro12 = new Livro("Game of Thrones 5", "George R. R. Martin",2011);
    
        //Adionando as Conexoes
        //Coleção do percy jackson
        livrosGrafo.adicionarConexao(livro1,livro2);
        livrosGrafo.adicionarConexao(livro1,livro3);

        //Coleção as cronicas de Narnia
        livrosGrafo.adicionarConexao(livro4,livro5);
        livrosGrafo.adicionarConexao(livro4,livro6);
        livrosGrafo.adicionarConexao(livro5,livro6);
        livrosGrafo.adicionarConexao(livro5,livro7);

        //Coleção Game Of thrones
        livrosGrafo.adicionarConexao(livro8,livro9);
        livrosGrafo.adicionarConexao(livro8,livro10);
        livrosGrafo.adicionarConexao(livro10,livro11);
        livrosGrafo.adicionarConexao(livro11,livro12);

        //Conectando as coleções de livros
        livrosGrafo.adicionarConexao(livro7,livro8);
        livrosGrafo.adicionarConexao(livro12,livro4);
        livrosGrafo.adicionarConexao(livro3,livro4);
        
        //Imprimindo as conexões
        livrosGrafo.imprimirGrafo();

        //Criando um usuario
        Usuario jorge = new Usuario("Jorge");

        //Fila de Espera
        jorge.adicionarFilaDeEspera(livro1);
        jorge.adicionarFilaDeEspera(livro4);
        jorge.adicionarFilaDeEspera(livro8);
        jorge.imprimirFilaDeEspera();

        //Empresta o livro
        jorge.emprestarLivro(livro1);
        jorge.emprestarLivro(livro4);
        jorge.emprestarLivro(livro8);

        //Buscando o melhor caminho
        livrosGrafo.verificarDistancia(livro1);
        livrosGrafo.verificarDistancia(livro4);
        livrosGrafo.verificarDistancia(livro8);

        //Sugerindo livros
        jorge.sugerirLivros(livrosGrafo);
    }
}
