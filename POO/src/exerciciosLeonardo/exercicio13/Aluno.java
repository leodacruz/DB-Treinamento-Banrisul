package exercicio13;

public class Aluno {
	private String nome;
	private double[] notas;

	// construtor
	public Aluno() {
	}

	public Aluno(String nome, double[] notas) {
		this.nome=nome;
		this.notas=notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNota() {
		return notas;
	}

	public void setNota(double[] notas) {
		this.notas = notas;
	}
}
