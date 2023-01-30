/*Exercicio 11
Ordene um vetor de 100 numeros inteiros gerados
aleatoriamente. (Pesquisar sobre Bubble Sort)*/

package exercicios;

import java.util.Random;

public class Exercicio11 {

    public static void main(String[] args) {

    	//gerar o vetor aleatoriamente
        Random geradorAleatorio = new Random();
        int vetor[] = new int[100];

        for (int i = 0; i < 100; i++) {
            vetor[i] = geradorAleatorio.nextInt(100);
        }
        
        //imprimir este vetor
        System.out.println("Vetor antes ");
        for (int i = 0; i < 100; i++) {
           System.out.print(" "+vetor[i]+" ");
           if(i>2 && i%30==0) {
               System.out.println();
           }
        }

        // buble sort
        boolean confirmacao = false;
        do {
            confirmacao=false;
            for (int i = 0; i < 99; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int auxiliar = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = auxiliar;
                    confirmacao = true;
                }
            }
        } while (confirmacao);
        
        
        //imprimir o vetor ordenado
        System.out.println("\n\nVetor depois ");
        for (int i = 0; i < 100; i++) {
           System.out.print(vetor[i]+"  ");
           if(i>2 && i%30==0) {
               System.out.println();
           }
        }

    }

}
