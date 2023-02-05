package exercicio16;

import java.util.Arrays;

class Emprestimo {
	private Pessoa pessoa;
	private Livro[] livros;

	// construtor
	Emprestimo(Pessoa pessoa, Livro[] livros) {
		this.pessoa = pessoa;
		this.livros = livros;
	}

	Pessoa getPessoa() {
		return pessoa;
	}

	Livro[] getLivros() {
		return livros;
	}

	@Override
	public String toString() {
		return "Emprestimo [pessoa=" + pessoa + ",\nLivros= " + livros.length + Arrays.toString(livros) + "]";
	}
}
