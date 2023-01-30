/*Exercicio 7
 Calcule a serie de Fibonacci para um numero inteiro nao negativo
informado pelo usuario. A serie de Fibonacci inicia com os
numeros F0 = 0 e F1 = 1, e cada numero posterior equivale a soma
dos dois numeros anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
o usuurio informe o numero 9, o resultado seria 0, 1, 1, 2, 3, 5,
8, 13, 21, 34.
Usar while/ do - while*/

package exercicios;

public class Exercicio7 {

	public static void main(String[] args) {
            //Fibo usando vetor(Problema que gasta memoria)
			System.out.println("Fibonacci de 25 : ");
			int valorFibo[] = new int[25];
			valorFibo[0]=0;
			valorFibo[1]=1;
			System.out.print(valorFibo[0] + "  ");
			System.out.print(valorFibo[1] + "  ");
			
			for (int i = 2; i < 25; i++) {
				valorFibo[i] = valorFibo[i-1] + valorFibo[i-2];
				System.out.print(valorFibo[i] + "  ");
			}

		} 

	}

