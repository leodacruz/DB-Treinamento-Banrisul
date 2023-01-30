package conceitos;

import conceitos.Biscoito;

public class Pessoa { // Entidade
    
    public String nome;
    private boolean bocaAberta = false; // característica
    public boolean gostaDeBiscoito = false; // característica
    
    public void comer(Biscoito biscoito) { // comportamento
        if (gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado");
        } else {
            System.out.println("Não, não gosto, obrigado");
        }
    }
}
