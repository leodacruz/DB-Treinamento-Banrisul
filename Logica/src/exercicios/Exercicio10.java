/*Exercicio 10
 *Leia uma matriz quadrada e determine a soma da diagonal
principal. */

package exercicios;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		Random geradorAleatorio = new Random();

		// gerar a matriz com valores aleatorios
		int matriz[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(10);
			}
		}

		// imprimir esta matriz mostrando a diagonal
		System.out.print("\nA matriz eh : ");
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if(i==j) {
					System.out.print(" ["+matriz[i][j]+"]  " );	
				}else
				System.out.print("  "+matriz[i][j] + "   ");
			}
		}

		// calcula a soma da diagonal
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += matriz[i][i];
		}

		System.out.println("\n\nA soma da diogonal eh = " + soma);
		
		System.out.println("\n\nPrograma Finalizado");
	}
}


