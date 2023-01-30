/*Exercicio 12
 *Crie dois vetores de 50 posicoes com valores inteiros aleatarios,
ordene cada vetor individualmente, e combine os dois vetores
gerando um novo vetor de 100 posisoes, ordenando esse novo */

package exercicios;

import java.util.Random;

public class Exercicio12 {

    public static void main(String[] args) {

        Random geradorAleatorio = new Random(System.currentTimeMillis());

        //os tres vetores
        int vetor1[] = new int[100];
        int vetor2[] = new int[100];
        int vetor3[] = new int[200];

        //gero 2 vetores de forma aleatoria
        for (int i = 0; i < 100; i++) {
            vetor1[i] = geradorAleatorio.nextInt(100);
            vetor2[i] = geradorAleatorio.nextInt(100);
        }
        
        
        System.out.println("Vetor1 antes de ordenar: ");
        imprimeVetor(vetor1);
        vetor1 = bubleSort(vetor1);
        System.out.println("\n\nVetor1 depois de ordenar: ");
        imprimeVetor(vetor1);
        
        
        System.out.println("\n\nVetor2 antes de ordenar: ");
        imprimeVetor(vetor2);
        vetor2 = bubleSort(vetor2);
        System.out.println("\n\nVetor2 depois de ordenar: ");
        imprimeVetor(vetor2);
        
        
        //boto os dois vetores dentro do vetor3
        for (int i = 0; i < 200; i++) {
            if (i < 100) {
                vetor3[i] = vetor1[i];
            } else {
                vetor3[i] = vetor2[i-100];
            }

        }
        
        System.out.println("\n\nVetor3 antes de ordenar: ");
        imprimeVetor(vetor3);
        vetor3 = bubleSort(vetor3);
        System.out.println("\n\nVetor3 depois de ordenar: ");
        imprimeVetor(vetor3);
        
        
        System.out.println("\n\nPrograma Finalizado");

    }

    public static int[] bubleSort(int[] vetor) {

        // buble sort
        boolean confirmacao = false;
        do {
            confirmacao = false;
            for (int i = 0; i < (vetor.length -1); i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int auxiliar = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = auxiliar;
                    confirmacao = true;
                }
            }
        } while (confirmacao);

        return vetor;
    }

    public static void imprimeVetor(int[] vetor) {
        System.out.println("\nVetor:  " +vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
            if (i > 2 && i % 30 == 0) {
                System.out.println();
            }
        }
    }

}
