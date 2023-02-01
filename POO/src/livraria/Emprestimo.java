package exercicios.livraria;

import java.time.LocalDateTime;

// Empréstimo
// 1 Tomador (Pessoa)
// 1 Livro

public class Emprestimo {
    private final int NUMERO_DIAS_RETORNO_LIVRO = 15; // Regra de negócio que indica que um livro pode ser emprestado por 15 dias
    
    private Livro livro;
    private Pessoa tomador;
    private String dataCriacao;
    private String dataPrevisaoRetorno;
    
    public Emprestimo(Livro livro, Pessoa tomador) { // 3 Parâmetros
        this.setLivro(livro);
        this.setTomador(tomador);
        this.dataCriacao = LocalDateTime.now().toString(); // Complexidade abstraída do mundo exterior
        this.dataPrevisaoRetorno = LocalDateTime.now().plusDays(NUMERO_DIAS_RETORNO_LIVRO).toString(); // Complexidade abstraída do mundo exterior
    }

    // Consulta do empréstimo
    public String getEmprestimo() {
        String livroDesc = this.livro.getTitulo() + " (" + this.livro.getIsbn() + ")";
        String pessoaDesc = this.tomador.getNome();
        String periodo = this.dataCriacao + " e " + this.dataPrevisaoRetorno;
        
        return "O livro " + livroDesc + "\nFoi emprestado para " + pessoaDesc + "\nDurante " + periodo;
    }
    
    public Livro getLivro() {
        return this.livro;
    }
    private void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getTomador() {
        return this.tomador;
    }
    private void setTomador(Pessoa tomador) {
        this.tomador = tomador;
    }
}
