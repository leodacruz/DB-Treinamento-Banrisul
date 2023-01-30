/*Faça um metodo que calcule a media de um aluno de acordo
com o criterio definido neste curso. Alem disso, faça um outro
metodo que informe o status do aluno de acordo com a tabela a
seguir:
- Nota acima de 6: “Aprovado”
- Nota entre 4 e 6: “Verificação Suplementar”
- Nota abaixo de 4: “Reprovado”
FIZ USANDO POO
*/

package exercicio13;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Aluno aluno = dadosAluno();
		Curso curso = new Curso();

		// Na classe curso esta os calculos para saber a media e aprovacao
		System.out.println("\n\nMedia do aluno " + aluno.getNome() + " foi de " + curso.mediaAluno(aluno));
		System.out.println("Portanto, O aluno " + aluno.getNome() + curso.aprovacao(aluno));

	}

	// metodo para inserir o nome do aluno
	public static Aluno dadosAluno() {
		Scanner sc = new Scanner(System.in);

		// tratar o nome
		String nome;
		System.out.println("Insira o nome do estudante");
		try {
			nome = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Erro ao inserir o nome \n AutoEscolha: Fulano");
			nome = "Fulano";
		}

		// tratar as notas
		System.out.println("Insira as notas do(a) " + nome);
		double[] notas = new double[5];
		try {
			for (int i = 0; i < 5; i++) {
				while (true) {
					System.out.print("\nInsira a nota " + (i + 1) + " : ");
					notas[i] = sc.nextDouble();
					if (notas[i] <= 10 && notas[i] >= 0) {
						break;
					} else {
						System.out.print("Valor informado errado, tente novamente");
					}
				}

			}

		} catch (Exception e) {
			System.out.println("Erro ao inserir as notas " + e);
			System.out.println("Programa Encerrado");
			System.exit(0);
		}

		System.out.println("\nNotas inseridas com sucesso!");
		sc.close();

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNota(notas);
		return aluno;
	}

}
