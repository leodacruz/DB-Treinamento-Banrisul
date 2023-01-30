/*Exercicio extra 2
 *Escreva um algoritmo que use loops para encontrar 
 *e imprimir todos os numeros
 * primos entre um dado range de numeros. 
 * */
package exercicios;

import java.util.Scanner;

public class ExercicioExtra2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//para saber o range
		System.out.println("Digite o valor a ser usado como range: ");
		int range = 0;
		try {
			range = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
		sc.close();

		//para saber se eh primo/ sem melhorias, no braco, testando todos contra todos
		boolean primo = true;

		for (int i = 1; i < range; i++) {                   //ele testa se eh primo todos os numeros do range
			primo = true;									//todo numero e dado como primo ate provar o contrario
			for (int j = 1; j < i; j++) {                   //divido ate ele mesmo 
				if (i % j == 0  && j != 1) {                //comeco a divisoes ate o resto for 0
					primo = false;                          //se for 0 nao eh primo
					break;                                  //paro esse for e testo o proximo numero
				}
			}

			if (primo) {                                    //antes de testar o prox numero eu pergunto se o atual eh primo
				System.out.println(" 	" + i);             //caso ele nunca entrou no if ali, ele eh primo, dai imprimo ele
			}
		}

		System.out.println("\n\nPrograma Finalizado");

	}
}