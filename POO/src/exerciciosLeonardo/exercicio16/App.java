package exercicio16;

import java.util.Random;

class App {

	private static int id_pessoa;
	private static int id_livro;

	public static void main(String[] args) {
		// Aqui minha logica de emprestimo funciona assim
		// cada emprestimo tera uma pessoa e um array de livros
		// um livro pode ter mais de uma pessoa com emprestimo dele
		// cada pessoa pode no max pegar 10 livros por emprestimo

		// Uso os construtores nas classes

		// instanciar os objetos das classes na ordem correta, primeiro livro
		// depois pessoa e depois emprestimo

		id_livro = 100;
		id_pessoa = 100;

		// instancio um array de livros
		Livro[] livros = new Livro[100];

		// instancio um array de pessoas
		Pessoa[] pessoas = new Pessoa[50];

		// instancio um array de Emprestimo
		Emprestimo[] emprestimos = new Emprestimo[100];

		// gerar livros aleatorios
		for (int i = 0; i < 100; i++) {
			livros[i] = new Livro(nomeAleatorio(), id_livro);
			id_livro++;
		}

		// gerar pessoas aleatorias
		for (int i = 0; i < 50; i++) {
			pessoas[i] = new Pessoa(nomeAleatorio(), id_pessoa);
			id_pessoa++;
		}

		// gerar emprestimos aleatorios
		for (int i = 0; i < 100; i++) {
			Random geradorAleatorio = new Random();
			int pessoa = geradorAleatorio.nextInt(50);

			int quantidadeLivros = (geradorAleatorio.nextInt(10) + 1); // aqui esta a limitacao dos 10 livros por
																		// emprestimo
			Livro[] livrosEmprestados = new Livro[quantidadeLivros];
			for (int j = 0; j < quantidadeLivros; j++) {
				livrosEmprestados[j] = livros[geradorAleatorio.nextInt(50)];
			}
			emprestimos[i] = new Emprestimo(pessoas[pessoa], livrosEmprestados);
		}

		// Agora as impressoes para validar os processos

		System.out.println("As pessoas criadas aleatoriamentes foram : ");
		for (Pessoa lista : pessoas) { // for each
			System.out.println(lista.getNome());
		}

		// Os livros aleatorios foram
		System.out.println("\n\nOs livros criadas aleatoriamentes foram : ");
		for (Livro lista : livros) { // for each
			System.out.println(lista.getNome());
		}

		// Os emprestimos feitos
		System.out.println("\n\nOs emprestimos feitos foram: ");
		for (Emprestimo lista : emprestimos) {
			System.out.println(lista.toString() + "\n");
		}

	}

	// metodo para criar uma pessoa
	static Pessoa createPessoa() {
		return new Pessoa("nome", 87);
	}

	// metodo para criar um livro
	static Livro crateLivro() {
		return new Livro("leo", 3);
	}

	// para construir um nome aleatorio //pode ser melhorado para ficar mais
	// humanizado e fazer um gerador livros e nomes pessoas
	static String nomeAleatorio() {
		Random geradorAleatorio = new Random();
		char[] nome = new char[6];
		// gerador de 25 letras, 65 onde comeca 'A' na ascii
		for (int i = 0; i < 6; i++) {

			if (i == 1 || i == 3 || i == 5) {
				nome[i] = vogalAleatoria();
			} else
				nome[i] = (char) (geradorAleatorio.nextInt(25) + 65);
		}
		return new String(nome);
	}

	static char vogalAleatoria() {
		Random geradorAleatorio = new Random();

		int vogal = geradorAleatorio.nextInt(6);

		switch (vogal) {
			case 0:
				return 'A';
			case 1:
				return 'E';
			case 2:
				return 'I';
			case 3:
				return 'O';
			case 4:
				return 'U';
			case 5:
				return 'Y';
			default:
				return 'A';

		}
	}

}
