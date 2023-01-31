package conceitos;

import conceitos.Biscoito;

public class Pessoa { // Entidade
    
    public String nome; // característica
    public int idade; // característica
    // private boolean bocaAberta = false; // característica
    public boolean gostaDeBiscoito = true; // característica
    
    
    // # ------------------------------- Conjunto de construtores
    public Pessoa () { // Construtor explícito (poderia estar implícito se não houvessem outros construtores)
        this("Indigente", -1); // Referenciando (chamando) outro construtor
    }
    public Pessoa (String nome) {
        this(nome, -1); // Referenciando (chamando) outro construtor
    }
    public Pessoa (String nome, int idade) {
        this.nome = nome; // Referenciando um atributo da classe com o this
        this.idade = idade; // Referenciando um atributo da classe com o this
    }
    
    // # ------------------------------- Lista dos métodos (comportamentos)
    public boolean comer(Biscoito biscoito) { // comportamento
        if (this.gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado");
        } else {
            System.out.println("Não, não gosto, obrigado");
        }
        
        return this.gostaDeBiscoito;
    }
    
    public boolean falar(String frase) {
        return true;
    }
}
