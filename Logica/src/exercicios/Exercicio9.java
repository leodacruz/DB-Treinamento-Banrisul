/*Exercicio 9
 Altere o exerc�cio 7 para o algoritmo contar a s�rie Fibonacci at�
um determinado n�mero. Por exemplo, caso declarado o n�mero
25, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21*/
package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser calculado: ");
		int numeroFibo = 25;

		try {
			numeroFibo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Erro " + e);
			System.out.println("Auto escolha = 25");
		}
		sc.close();
		
		System.out.println("Fibonacci ate o " + numeroFibo);

		// fibo sem vetor e só 3 variaveis
		long numero1 = 0;
		long numero2 = 1;
		System.out.print(numero1 + " ");
		System.out.print(numero2 + " ");
		
			for (;;) { //eh o mesmo que while(true)
				long atual = numero1 + numero2;
				numero1 = numero2;
				numero2 = atual;
				if (atual > numeroFibo) {
					break;
				} else {
					System.out.print(atual + " ");
				}
			}

		System.out.println("\n\nPrograma Finalizado");

	}
}
