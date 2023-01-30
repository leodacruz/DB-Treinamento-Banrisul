/*Exercicio 8
 Leia um numero ate que o usuario digite 10*/

package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			for (;;) { // isso é o mesmo que while(1)
				System.out.println("\nDigite um numero : ");
				int numero = sc.nextInt();

				if (numero == 10) {
					System.out.println("Voce digitou 10. \n Fim do programa");
					break;
				} else {
					System.out.println("\n\nVoce digitou = " + numero);
				}

			}

		} catch (Exception e) {
			System.out.println("ERRO " + e);
		}

		sc.close();
		System.out.println("Programa Finalizado");
	}
}
