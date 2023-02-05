package exercicio17;

class Pessoa {
	private String nome;
	private int idade;
	private Pessoa pai;
	private Pessoa mae;

	// construtor
	Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.mae = mae;
		this.pai = pai;
		this.idade = idade;
	}

	// construtor sem pai
	Pessoa(String nome, int idade, Pessoa mae) {
		this.nome = nome;
		this.mae = mae;
		this.pai = null;
		this.idade = idade;
	}

	// construtor sem mae
	Pessoa(String nome, Pessoa pai, int idade) {
		this.nome = nome;
		this.mae = null;
		this.pai = pai;
		this.idade = idade;
	}

	// construtor sem pai e mae
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.mae = null;
		this.pai = null;
		this.idade = idade;
	}

	// construtor sem idade
	Pessoa(String nome) {
		this.nome = nome;
		this.mae = null;
		this.pai = null;
		this.idade = 0;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	Pessoa getPai() {
		return pai;
	}

	Pessoa getMae() {
		return mae;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "\n pai=" + pai + "\n mae=" + mae + "]";
	}

}
