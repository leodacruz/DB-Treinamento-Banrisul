package arvore;

public class Pessoa {
    private String nome;
    private int idade;
    
    private Pessoa mae; /* null */ // Altera��es do modelo de m�e est�o acontecendo tamb�m
    private Pessoa pai; /* null */ // Altera��es do modelo de pai est�o acontecendo tamb�m
    
    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setMae(mae);
        this.setPai(pai);
    }
    public Pessoa(String nome, int idade) {
        // this(nome, idade, null, null); // Proxy de um construtor para outro
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getMae() {
        return this.mae;
    }
    private void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return this.pai;
    }
    private void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    public String getArvore() {
        String arvore = this.getNome() + "(" + this.idade + " anos)";
        
        if (this.pai != null && mae != null) {
            arvore = arvore.concat("\n" + this.getPai().getArvore());
            arvore = arvore.concat("\n" + this.getMae().getArvore());
        }
        
        return arvore;
    }
}
