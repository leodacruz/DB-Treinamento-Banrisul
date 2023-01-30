/* exercicio 5
 * Construa a tabuada de um numero. (ex: 1x1=1,
1x2=2,...,1x10=10);
 * */
package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual tabuada deseja ver? ");
		int tabuada=0;
		try {
		    tabuada = sc.nextInt();
			} catch (Exception e) {
			System.out.println("Erro!\n Vc nao digitou um numero");
		}
			
			System.out.println();
			for (int i = 0; i < 11; i++) {
				System.out.println(tabuada + " x " + i + "  = " + i * tabuada);
			}

		
		sc.close();
		System.out.println("\nPrograma Finalizado");
	}

}
