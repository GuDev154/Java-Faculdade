package Semana05;

class No{
    int valor;
    No esquerda;
    No direita;

    public No(int newValor){
        this.valor = newValor;
        esquerda = null;
        direita = null;
    }
}

class ArvoreBinaria{
    No raiz;

    public ArvoreBinaria(){
        raiz = null;
    } 

    public void inserir(int valor){
        raiz = inserirRecursivamente(raiz, valor);
        
    }

    private No inserirRecursivamente(No nodeAtual, int valorParaInserir){
        if (nodeAtual == null){
            return new No(valorParaInserir);
        }
        if (valorParaInserir < nodeAtual.valor){
            nodeAtual.esquerda = inserirRecursivamente(nodeAtual.esquerda, valorParaInserir);
        } else if (valorParaInserir > nodeAtual.valor){
            nodeAtual.direita = inserirRecursivamente(nodeAtual.direita, valorParaInserir);
        }

        return nodeAtual;
    }

    public boolean procurarValor(int valorParaPesquisar){
       return procurarRecursivamente(raiz, valorParaPesquisar);
    }

    public boolean procurarRecursivamente(No nodeAtual, int valorParaPesquisar){
        if( nodeAtual == null){
            return false;
        }

        if(nodeAtual.valor == valorParaPesquisar){
            return true;
        }

        return valorParaPesquisar < nodeAtual.valor 
        ? procurarRecursivamente(nodeAtual.esquerda, valorParaPesquisar)
        : procurarRecursivamente(nodeAtual.direita, valorParaPesquisar);
    }

    public void removerElemento(int valorParaRemover){
        raiz = removerRecursivamente(raiz, valorParaRemover);
    }

    private No removerRecursivamente(No nodeAtual,int valorParaRemover){
        if(nodeAtual == null){
            return null;
        }
        if(valorParaRemover == nodeAtual.valor){
            if(nodeAtual.esquerda == null && nodeAtual.direita == null){
                return null;
            }
            if(nodeAtual.esquerda == null){
                return nodeAtual.direita;
            }

            if(nodeAtual.direita == null){
                return nodeAtual.esquerda;
            }

            int maiorValorEntreFilhos = procurarMaiorValor(nodeAtual.esquerda);
            nodeAtual.valor = maiorValorEntreFilhos;
            nodeAtual.esquerda = removerRecursivamente(nodeAtual.esquerda, valorParaRemover);
            return nodeAtual;

        } else if(valorParaRemover < nodeAtual.valor){
            nodeAtual.esquerda =removerRecursivamente(nodeAtual.esquerda, valorParaRemover);
            return nodeAtual;
        } else{
            nodeAtual.direita = removerRecursivamente(nodeAtual.direita, valorParaRemover);
            return nodeAtual;
        }

    }

    private int procurarMaiorValor(No nodeAtual){

        return nodeAtual.direita == null ? nodeAtual.valor : procurarMaiorValor(nodeAtual.direita);

    }

    public void mostrarArvore(){

    }
    private void mostrarNoRecursivamente(No nodeAtual, int nivelDaArvore){
        if(nodeAtual == null){
            return;
        }
        if(nivelDaArvore > 0){
            System.out.print("");
        }

        System.out.print(nodeAtual.valor);
        mostrarNoRecursivamente(nodeAtual.esquerda, nivelDaArvore);
        mostrarNoRecursivamente(nodeAtual.direita, nivelDaArvore);
    }

}

public class Main {
    ArvoreBinaria arvoreExemplo = new ArvoreBinaria();

   
}
