/*Escreva um programa que use um loop for 
 * para criar um array de 1 a 1000 e depois encontrar e
 *  imprimir todos os numeros palindromos (descobrir o significado)*/

package exercicios;

import java.util.Random;

public class ExercicioExtra1 {

	public static void main(String[] args) {
		Random geradorAleatorio = new Random(System.currentTimeMillis());

		// 2 vetores
		int vetor1[] = new int[1000];
		int vetor2Palindromos[] = new int[1000];

		// fazer o vetor de numeros aleatorios
		for (int i = 0; i < 1000; i++) {
			vetor1[i] = geradorAleatorio.nextInt(1000);
		}

		// percorre o vetor e vai vendo quem eh palindromo
		int contadorPalindromo = 0;
		for (int i = 0; i < 1000; i++) {
			if (palindromo(vetor1[i])) { // aqui ele retorna true caso o numero seja palindromo
				vetor2Palindromos[contadorPalindromo] = vetor1[i];
				contadorPalindromo++;

			}
		}

		// imprime os palindromes
		System.out.println("O total de palindromos sao: " + contadorPalindromo);
		System.out.println("Eles sao : ");
		imprimeVetor(vetor2Palindromos, contadorPalindromo);

	}

	public static boolean palindromo(int numero) {
		if (numero < 10) { // menor que 10 ja considero palindromo
			return true;

		} else {
			if (numero < 100) { // dai aqui precisa ver se a dezena e unidade sao iguais

				if (numero / 10 == numero % 10) { // forma de ver isso
					return true;
				} else {
					return false;
				}

			} else {

				if (numero / 100 == numero % 100) { //ve se a unidade eh igual a centena
					return true;
				} else {
					return false;
				}
			}
		}

	}

	public static void imprimeVetor(int[] vetor, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + "  ");
			if (i > 2 && i % 30 == 0) {
				System.out.println();
			}
		}
	}

}
