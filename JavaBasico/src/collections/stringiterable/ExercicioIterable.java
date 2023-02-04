package collections.stringiterable;

/**
 * Problema (nesse caso poderíamos afirmar que este é um problema técnico, e não de negócio) a ser resolvido: 
 * Criar uma estrutura (objeto / elemento a ser usado na base de código) capaz de operar em uma string 
 * DIRETAMENTE através de um forEach 
 * */
public class ExercicioIterable {
    
    public static void main(String[] args) {
        // A classe StringIteravel é a responsável por resolver o problema proposto
        StringIteravel iteradorDeStrings = new StringIteravel(" Maçã, Banana, Melão, Melancia, Uva, Manga, Pêra ");
        
        /*
         * E assim, o forEach é capaz de iterar DIRETAMENTE através desse objeto "iteradorDeStrings" que é uma instância
         * da classe "StringIteravel" 
         * */
        for (String valorAtual : iteradorDeStrings) {
            System.out.println(valorAtual);
        }
    }
    
}
