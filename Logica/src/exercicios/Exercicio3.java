/* 3) Implemente um jogo Jokenpo (Pedra, papel ou tesoura). Serao o
jogador contra a maquina. O codigo tem que gerar as posisoes
aleatoriamente e comparar com o que escolhemos.*/

package exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random geradorNumeroAleatorio = new Random(); // Grealmente se define uma seed, mas esta ja esta definida na
														// classe
		// Random

		boolean ficarNoJogo = true; // para controlar quando sair do jogo

		while (ficarNoJogo) { // loop infinito ate o jogador nao querer jogar mais

			System.out.println("\n\nEscolha uma opcao \n" + "Pedra  Papel Tesoura \n " + "1      2      3");
			int escolhaUsuario = 0;

			try {
				escolhaUsuario = sc.nextInt();
			} catch (Exception e) {
				System.out.println("ERRO !!\n");
			}

			int escolhaRobo = geradorNumeroAleatorio.nextInt(3) + 1; // aqui o robo escolhe de 0 e 2. dai o +1 e para
																		// quando o robo escolher 0 dai fica 1, e tb
																		// pega o 3
			int resultado = 0; // 1 ganhou 2 perdeu 3 empatou
			System.out.println("Escolha robo = " + escolhaRobo +"\n\n");

			switch (escolhaUsuario) { //uso o switch para decidir que metodo acesso para validar o resultado
			case 1:
				resultado = testePedra(escolhaRobo);
				break;
			case 2:
				resultado = testePapel(escolhaRobo);
				break;
			case 3:
				resultado = testeTesoura(escolhaRobo);
				break;
			default:
				break;
			}

			switch (resultado) { //Para imprimir o resultado
			case 1:
				System.out.println("Voce ganhou");
				break;
			case 2:
				System.out.println("Voce perdeu");
				break;
			case 3:
				System.out.println("Voce empatou");
				break;
			default:
				System.out.println("Voce escolheu errado");
				break;

			}

			//como estou num loop infinito preciso confirmar com o usuario se ele quer continuar jogando
			System.out.println("\n\nAperte  0 para encerrar o Jogo OU qualquer outro numero para continuar Jogando");

			try {
				if (sc.nextInt() == 0) {
					ficarNoJogo = false;
				}
			} catch (Exception e) {
				System.out.println("Erro!! \n Vc nao digitou um numero\n Encerrando o jogo");
				ficarNoJogo = false;
			}

		}

		sc.close();

		System.out.println("Programa Finalizado");
	}

	public static int testeTesoura(int escolhaRobo) {
		switch (escolhaRobo) {
		case 1:
			return 2;
		case 2:
			return 1;
		case 3:
			return 3;
		default:
			return 0;
		}

	}

	public static int testePapel(int escolhaRobo) {
		switch (escolhaRobo) {
		case 1:
			return 1;
		case 2:
			return 3;
		case 3:
			return 2;
		default:
			return 0;
		}
	}

	public static int testePedra(int escolhaRobo) {
		switch (escolhaRobo) {
		case 1:
			return 3;
		case 2:
			return 2;
		case 3:
			return 1;
		default:
			return 0;
		}
	}
}
