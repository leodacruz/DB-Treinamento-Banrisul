package exercicio13;

public class Curso {

//construtor
	public Curso() {
	}

	public double mediaAluno(Aluno aluno) {
		double media = 0;
		double[] array = aluno.getNota();
		for (int i = 0; i < aluno.getNota().length; i++) {
			media += array[i];
		}

		return media / aluno.getNota().length;
	}

	public String aprovacao(Aluno aluno) {
		double media = mediaAluno(aluno);

		if (media < 4) {
			return " foi reprovado";
		} else if (media < 6) {
			return " esta em verificacao suplementar";
		} else {
			return " foi Aprovado";
		}
	}
}
