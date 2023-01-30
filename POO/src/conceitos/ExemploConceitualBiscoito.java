package conceitos;

import conceitos.Biscoito;
import conceitos.Pessoa;

public class ExemploConceitualBiscoito {

    public static void main(String[] args) {
        Pessoa renato = new Pessoa();
        
        Biscoito negresco = new Biscoito();
        Biscoito trakinas = new Biscoito();
        
        renato.comer(negresco);
    }
}
