/*1) Definir a idade de uma pessoa e verificar se ela eh maior de idade ou
nao*/

package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 			// crio um objeto da classe Scanner. Este processo eh chamado de instanciar
		System.out.println("Digite sua idade: "); 		// informar ao usuario que deve digitar a idade no console

		try { 											// isso eh para tratar excessões, caso o usuario digite qualquer coisa que nao
														// seja um numero se inicia uma excessao

			int idade = sc.nextInt(); 					// aqui estou guardando o valor que o usuario esta digitando na variavel idade

			if (idade > 18) { 							// se a idade for maior que 18 ...
				System.out.println("Maior de idade");
			} else { 									// se não ...
				System.out.println("Menor de idade");
			}
		} catch (Exception e) { 						// caso a pessoa escrveu algo que não seja um numero, ele imprime isso
			System.out.println("ERRO!!! \nNAO DIGITOU UMA IDADE VALIDA");

		} finally { //sempre eh executado apos o try e catch
			System.out.println("\n\nEncerramento do programa"); // so para informar que o programa acabou
			
											// curiosidade, o \n é o codigo em ascii para "new line / line feed" que é o pula
											// linha por isso ele pula a linha  na tabela ele eh o  numero 10
											// para demostrar isso olha só
			char pulaLinha = 10; 			// criei uma variavel em char mas informei um numero em vez de um caracter, 
											// desta forma ele entende esse numero
											// como oque tem na pos 10 da tabela ascii, que é o new line/line feed, que é o \n
			System.out.println("teste do pula linha" + pulaLinha + "se tiver em baixo funcionou"); // dai quando concateno ele aqui eh como se tivesse o \n que pula linha ali no meio
		}
		sc.close();
	}
}
