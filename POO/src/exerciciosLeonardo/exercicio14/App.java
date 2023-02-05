/*) Leia do usuario o tempo em segundos e escreva em horas,
minutos e segundos. Utilize cinco métodos, para a leitura e escrita
de dados e para obtenção de horas, minutos e segundos a partir
do tempo em segundos.
Ex: 7023 segundos equivalem a 1h57min3seg

*FIZ NO MODO PREGUICA, usei metodos pq nao vi razao para 
criar classes, mas esta bem evoluido*/

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

		long minutos = minutos(segundos);
		long horas = horas(segundos);
		long segundosExato = segundosExatos(segundos);
		long dias = dias(segundos);
		long semanas = semanas(segundos);
		long anos = anos(segundos);

		System.out.println("A conversao de  " + segundos + " segundos foi a de: ");
		System.out.println(anos + "a : " + semanas + " s : " + dias + "d : " + horas + "h : " + minutos + "m : "
				+ segundosExato + "s");

	}

	public static long minutos(long segundos) {
		return (segundos / 60 % 60);
	}

	public static long horas(long segundos) {
		return (segundos / 60 / 60) % 24;
	}

	public static long segundosExatos(long segundos) {
		return (segundos % 60 % 60);
	}

	public static long dias(long segundos) {
		return (segundos / 60 / 60) / 24 %7;
	}

	public static long semanas(long segundos) {
		return (segundos / 60 / 60) / 24 / 7;
	}

	public static long anos(long segundos) {
		return (segundos / 60 / 60) / 24 / 7 / 365;
	}

}
