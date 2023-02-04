package collections.stringiterable;

/**
 * Problema (nesse caso poder�amos afirmar que este � um problema t�cnico, e n�o de neg�cio) a ser resolvido: 
 * Criar uma estrutura (objeto / elemento a ser usado na base de c�digo) capaz de operar em uma string 
 * DIRETAMENTE atrav�s de um forEach 
 * */
public class ExercicioIterable {
    
    public static void main(String[] args) {
        // A classe StringIteravel � a respons�vel por resolver o problema proposto
        StringIteravel iteradorDeStrings = new StringIteravel(" Ma��, Banana, Mel�o, Melancia, Uva, Manga, P�ra ");
        
        /*
         * E assim, o forEach � capaz de iterar DIRETAMENTE atrav�s desse objeto "iteradorDeStrings" que � uma inst�ncia
         * da classe "StringIteravel" 
         * */
        for (String valorAtual : iteradorDeStrings) {
            System.out.println(valorAtual);
        }
    }
    
}
