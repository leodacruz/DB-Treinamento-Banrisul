package exercicios.livraria;

public class Pessoa {
    private String doc; // Id
    private String nome;
    
    public Pessoa(String doc, String nome) {
        this.setDoc(doc);
        this.setNome(nome);
    }
    
    public String getDoc() {
        return this.doc;
        
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
