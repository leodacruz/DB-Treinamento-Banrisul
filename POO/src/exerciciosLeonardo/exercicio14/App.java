/*) Leia do usuario o tempo em segundos e escreva em horas,
minutos e segundos. Utilize cinco métodos, para a leitura e escrita
de dados e para obtenção de horas, minutos e segundos a partir
do tempo em segundos.
Ex: 7023 segundos equivalem a 1h57min3seg

*FIZ NO MODO PREGUICA*/

package exercicio14;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long segundos = 0;
		System.out.println("Informe o tempo em segundos: ");
		try {
			segundos = sc.nextLong();
		} catch (Exception e) {
			System.out.println("ERRO!\nVC nao escreveu um numero valido\nPrograma finalizado");
			System.exit(0);
		}
		sc.close();

		long minutos = segundos / 60 % 60;
		long horas = segundos / 60 / 60;
		long segundosExato = segundos % 60 % 60;

		System.out.println("A conversao de  " + segundos + " segundos foi a de: ");
		System.out.println(horas + "h : " + minutos + "m : " + segundosExato + "s");

	}
}
