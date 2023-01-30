package conceitos;

import conceitos.Biscoito;
import conceitos.Pessoa;

public class ExemploConceitualBiscoito {

    public static void main(String[] args) {
        Pessoa renato = new Pessoa("Renato"); // Instanciando uma nova pessoa passando dois parâmetros ao constructor
        renato.idade = 30;
        
        Pessoa andre = new Pessoa("André");
        andre.idade = 22;
        
        System.out.println(renato.nome + " tem " + renato.idade + " anos");
        
        Biscoito negresco = new Biscoito();
        Biscoito trakinas = new Biscoito();
        
        boolean comeu = renato.comer(negresco);
        System.out.println("Comeu? " + (comeu ? "Sim" : "Não"));
    }
}
