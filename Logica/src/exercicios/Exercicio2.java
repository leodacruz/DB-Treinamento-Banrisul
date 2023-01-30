/* 2) Para cada produto informado (nome, preco e quantidade), escreva o
nome do produto comprado e o valor total a ser pago, considerando
que sao oferecidos descontos pelo n�mero de unidades compradas,
segundo a tabela abaixo:
a. At� 10 unidades: valor total
b. De 11 a 20 unidades: 10% de desconto
c. De 21 a 50 unidades: 20% de desconto
d. Acima de 50 unidades: 25% de desconto*/

package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// instancio um objeto da classe Scanner

		//inicializo as variaveis antes do try
		String nomeProduto = "";
		double precoProduto = 0;
		int quantProd = 0;

		try { // testa pra ver se o usuario vai escrever valores validos
			System.out.println("Informe o nome do produto: ");
			nomeProduto = sc.nextLine();
			System.out.println("Informe o Preco do produto: ");
			precoProduto = sc.nextDouble();
			System.out.println("Informe a quantidade de Produtos: ");
			quantProd = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("ERRO! \n Preco ou Quantidade Errados");
		} catch (Exception e) {
			System.out.println("ERRO! \n ALGUMA INFORMAÇÃO ERRADA \n" + e +"\n\n");
		}

		//calculos para descobrir se vai haver descontos
		double precoFinal = precoProduto * quantProd;
		double desconto = 0;
		
		if (quantProd > 50) {
			// desconto %25
			desconto = precoFinal * 0.25;
		} else if (quantProd > 20) {
			// desconto %20
			desconto = precoFinal * 0.20;
		} else if (quantProd > 10) {
			// desconto %10
			desconto = precoFinal * 0.10;
		}

		double precoFinalDesconto = precoFinal - desconto;

		//impressao dos resultados
		System.out.println("\nResumo da sua compra \n" + "Nome do produto : " + nomeProduto + "\nQuantidade : "
				+ quantProd + "\nPreco Unitario :" + precoProduto + " R$" + "\nValor Total : " + precoFinal + " R$"
				+ "\nValor Final com desconto aplicado: " + precoFinalDesconto + " R$" + "\nO seu desconto foi de "
				+ desconto + " R$");

		sc.close();
	}

}
