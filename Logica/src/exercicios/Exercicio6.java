/*Exercicio 6
 Gere 10 n�meros aleat�rios entre 0 e 100; mostre todos na tela
(em uma �nica linha); identifique o menor e o maior deles.*/

package exercicios;

import java.util.Random;

public class Exercicio6 {

	public static void main(String[] args) {
		Random geradorAleatorio = new Random();

		int maior = 0; 
		int menor = 101;
		
		System.out.println("Os numeros aleatorios sao: ");
		
		for (int i = 0; i < 10; i++) {//vai executar esse laco 10 vezes
			int numeroAleatorio = geradorAleatorio.nextInt(101); //aqui ele gera do 0 ao 100,ele desconsidera o 101
			
			if (numeroAleatorio < menor) {
				menor = numeroAleatorio;
			}
			if (numeroAleatorio > maior) {
				maior = numeroAleatorio;
			}
			System.out.print(numeroAleatorio + "  ");
			

		}
		System.out.println("\nO maior entre eles eh o  " + maior);
		System.out.println("O menor entre eles eh o  " + menor);
		
		System.out.println("\n\nPrograma Finalizado" );
	}

}
