package exercicio17;

public class Pessoa {
	private String nome;
	private int idade;
	private Pessoa pai;
	private Pessoa mae;

	// construtor
	public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.mae = mae;
		this.pai = pai;
		this.idade = idade;
	}

	// construtor sem pai
	public Pessoa(String nome, int idade, Pessoa mae) {
		this.nome = nome;
		this.mae = mae;
		this.pai = null;
		this.idade = idade;
	}

	// construtor sem mae
	public Pessoa(String nome, Pessoa pai, int idade) {
		this.nome = nome;
		this.mae = null;
		this.pai = pai;
		this.idade = idade;
	}

	// construtor sem pai e mae
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.mae = null;
		this.pai = null;
		this.idade = idade;
	}

	// construtor sem idade
	public Pessoa(String nome) {
		this.nome = nome;
		this.mae = null;
		this.pai = null;
		this.idade = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "\n pai=" + pai + "\n mae=" + mae + "]";
	}
	
	
	
	
	
	

}
