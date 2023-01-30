package exercicio16;

public class Livro {
	private String nome;
	private int id_livro;


	// construtor
	public Livro(String nome, int id_livro) {
		this.nome = nome;
		this.id_livro = id_livro;
	}
	// Toda vez que uma pessoa for instanciar um objeto do tipo Livro ela
	// tera que passar por parametros um nome e uma id_livro, e todo livro
	// um exemplo de como instanciar este objeto:
	// Livro livro = new Livro("nome do livro", 876);
	// assim respeito este construtor, lembrando todo numero no java
	// ja é interpretado como se fosse do tipo int e tudo entre " " é
	// identificado como String

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public int getId_livro() {
		return id_livro;
	}

	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}

	@Override
	public String toString() {
		return "Livro [nome= " + nome + ", id_livro= " + id_livro + ", emprestado= " +"]";
	}
}
