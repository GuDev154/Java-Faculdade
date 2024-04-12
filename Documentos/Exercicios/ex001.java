//Mostrando o Funcionamento de um ARRAY e Inicializando
package Exercicios;
public class ex001 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
   
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i*5;
        }
        System.out.println("Conteúdo do array: ");
        for (int num: numeros){
            System.out.println(num + "");
        }
    }
}
