package estruturacondicaorepeticaoextra;

import java.util.ArrayList;

public class ExemploForEach {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        
        frutas.add("Maçã");
        frutas.add("Pêssego");
        frutas.add("Uva");
        frutas.add("Laranja");
        
        for (String elementoAtual : frutas) {
            System.out.println(elementoAtual);
        }
    }
}
