package conceitos;

import conceitos.Biscoito;

public class Pessoa { // Entidade
    
    public String nome; // caracter�stica
    public int idade; // caracter�stica
    // private boolean bocaAberta = false; // caracter�stica
    public boolean gostaDeBiscoito = true; // caracter�stica
    
    
    // # ------------------------------- Conjunto de construtores
    public Pessoa () { // Construtor expl�cito (poderia estar impl�cito se n�o houvessem outros construtores)
        this("Indigente", -1); // Referenciando (chamando) outro construtor
    }
    public Pessoa (String nome) {
        this(nome, -1); // Referenciando (chamando) outro construtor
    }
    public Pessoa (String nome, int idade) {
        this.nome = nome; // Referenciando um atributo da classe com o this
        this.idade = idade; // Referenciando um atributo da classe com o this
    }
    
    // # ------------------------------- Lista dos m�todos (comportamentos)
    public boolean comer(Biscoito biscoito) { // comportamento
        if (this.gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado");
        } else {
            System.out.println("N�o, n�o gosto, obrigado");
        }
        
        return this.gostaDeBiscoito;
    }
    
    public boolean falar(String frase) {
        return true;
    }
}
