/* exercicio 4
Usar switch-case
4) Implemente o programa da calculadora utilizando uma instru��o
switch-case para determinar a opera��o que deve ser executada,
conforme o usu�rio escolheu no menu de op��es.
 * */
package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voce quer \n Dividir   Multiplicar   Somar   Subtrair" + 
		"\n     1          2          3        4 \n");

		int escolhaUsuario = 0;

		try {
			escolhaUsuario = sc.nextInt();
		} catch (Exception e) {
			System.out.println("ERRO! \n Escolha errada");

		}

		switch (escolhaUsuario) {
		case 1:
			dividir();
			break;
		case 2:
			multiplicar();
			break;
		case 3:
			somar();
			break;
		case 4:
			subtrair();
			break;
		default:
			System.out.println("Voce escolheu errado");
			break;

		}

		sc.close();

	}

	public static void dividir() {
		// aqui implementar a divisao,cuidando que nao existe divisao po 0
		// dai eh so fazer o dialogo com o usuario
		// perguntar qual o valo do dividendo, e depois do divisor, lembrando que o
		// divisor nao pode ser 0. depois disso fazer a divisao e mostrar o resultado.
		// fazer esse processo pros demais metodos, estou com preguica de faze-los
		System.out.println("Metodo Divisao Incompleta");
	}

	public static void multiplicar() {
		// aqui implementar a multiplicacao
		System.out.println("Metodo Multiplicacao Incompleta");
	}

	public static void somar() {
		// aqui implementar a soma
		System.out.println("Metodo soma Incompleta");
	}

	public static void subtrair() {
		// aqui implementar a subtracao
		System.out.println("Metodo subtracao Incompleta");
	}

}
