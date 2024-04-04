package Semana03;
import java.util.LinkedList;

class FilaUsandoListaLigada{
    private LinkedList<Integer> ListaInterna = new LinkedList<>();

    public void incluirElementoNaFila(int valor) {
        ListaInterna.addLast(valor);
    }

    public int removerElementoDaFila() {
        if (!verificarSeFilaEstaVazia()){
            return ListaInterna.removeFirst();
        } else{
            System.out.println("A fila está Vazia!!");
            return -1;
        }
       
    }

    public boolean verificarSeFilaEstaVazia() {
        return ListaInterna.isEmpty();
    }
}

class PilhaUsandoListaLigada{
    private LinkedList<Integer> ListaInterna = new LinkedList<>();

    public void incluirElementoNaPilha(int valor) {
        ListaInterna.addLast(valor);
    }

    public int removerElementoDaPilha() {
        if (!verificarSePilhaEstaVazia()){
            return ListaInterna.removeLast();
        } else{
            System.out.println("A pilha está Vazia!!");
            return -1;
        }
       
    }

    public boolean verificarSePilhaEstaVazia() {
        return ListaInterna.isEmpty();
    }
}

public class Teste {
    public static void main(String[] args) {

        //exemplo de listas ligadas 
        LinkedList<Integer> minhaListaLigada = new LinkedList<>();

        minhaListaLigada.add(9);
        minhaListaLigada.add(2);
        minhaListaLigada.add(52);
        minhaListaLigada.add(8);
        minhaListaLigada.add(96);
        minhaListaLigada.add(6);

        //Exemplo de Filas
        FilaUsandoListaLigada minhaFila = new FilaUsandoListaLigada();
        minhaFila.incluirElementoNaFila(56);
        minhaFila.incluirElementoNaFila(86);
        minhaFila.incluirElementoNaFila(95);
        minhaFila.incluirElementoNaFila(78);

        while (minhaFila.verificarSeFilaEstaVazia()) {
            int primeiroDaFila = minhaFila.removerElementoDaFila();
            System.out.println("O primeiro elemento da fila é" + primeiroDaFila);
            
        }

        //Exemplo de Pilhas
        PilhaUsandoListaLigada minhaPilha = new PilhaUsandoListaLigada();

        minhaPilha.incluirElementoNaPilha(56);
        minhaPilha.incluirElementoNaPilha(86);
        minhaPilha.incluirElementoNaPilha(95);
        minhaPilha.incluirElementoNaPilha(78);
        
        while (!minhaPilha.verificarSePilhaEstaVazia()){
            int primeiroDaPilha = minhaPilha.removerElementoDaPilha();
            System.out.println("O que está no topo da Pilha atualmente é :  " + primeiroDaPilha);
        }

    }
}
