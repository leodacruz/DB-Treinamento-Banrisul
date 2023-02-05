package exercicio16;

class Pessoa {
	private String nome;
	private int id_pessoa;

	// construtor
	Pessoa(String nome, int id_pessoa) {
		this.nome = nome;
		this.id_pessoa = id_pessoa;

	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getId_pessoa() {
		return id_pessoa;
	}

	void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", id_pessoa=" + id_pessoa + "]";
	}

}
