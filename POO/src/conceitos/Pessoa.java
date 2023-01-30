package conceitos;

import conceitos.Biscoito;

public class Pessoa { // Entidade
    
    public String nome;
    private boolean bocaAberta = false; // caracter�stica
    public boolean gostaDeBiscoito = false; // caracter�stica
    
    public void comer(Biscoito biscoito) { // comportamento
        if (gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado");
        } else {
            System.out.println("N�o, n�o gosto, obrigado");
        }
    }
}
