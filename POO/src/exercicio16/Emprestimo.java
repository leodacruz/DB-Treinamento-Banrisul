package exercicio16;

import java.util.Arrays;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro[] livros;
	
	//construtor
	public Emprestimo(Pessoa pessoa, Livro[] livros) {
		this.pessoa = pessoa;
		this.livros = livros;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Livro[] getLivros() {
		return livros;
	}

	@Override
	public String toString() {
		return "Emprestimo [pessoa=" + pessoa + ",\nLivros= "+livros.length + Arrays.toString(livros) + "]";
	}
}
