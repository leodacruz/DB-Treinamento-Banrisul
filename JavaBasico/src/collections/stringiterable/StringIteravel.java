package collections.stringiterable;

import java.util.Iterator;

/*
 * A classe StringIteravel "implementa" a interface "Iterable" - interface pertencente � API de Collections do Java 
 * que "prop�e as regras contratuais" de como os seus implementantes devem fazer para que adquiram o "poder" de 
 * serem iterados por forEachs 
 * */
public class StringIteravel implements Iterable<String> { // O <> � um espa�o gen�rico - aqui eu defino que ele vai trabalhar com String, logo <String>
    // Pense nisso como o banco de dados interno do nosso "Iterable", aqui eu salvo a string original como ela chegou
    private String stringOriginal;
    
    /*
     * A classe StringIterador � a respons�vel por resolver o problema de criar o Iterator que o contrato com "Iterable" exige em um 
     * m�todo abaixo 
     * */
    private StringIterador iterador;
    
    // Construtor
    public StringIteravel(String stringOriginal) {
        // Apenas salvo a string original no meu estado, para ter isso no futuro se precisar
        this.stringOriginal = stringOriginal;
        
        /*
         * Aqui eu instancio ent�o um Iterator no meu atributo de estado, e j� passo
         * o resultado da string original quebrada certinho em peda�os e transformada em array
         * pelo construtor dele 
         * */
        this.iterador = new StringIterador(this.stringOriginal.trim().replace(" ", "").split(","));
    }
    
    /*
     * Aqui estou cumprindo com as regras contratuais do "Iterable". Ele me diz que eu preciso de um objeto que, por sua vez,
     * cumpra com as regras contratuais da interface "Iterator" - sub-interface do Iterable que dita as "regras contratuais" de
     * como os seus implementantes devem fazer para fazer a comunica��o com o forEach. Exemplo.:
     * 1 - Come�a o processo
     * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� tem um pr�ximo item dentro do seu banco de dados interno?"
     * 3 - objeto que implementa "Iterator" responde: - "Tenho"
     * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� pode me passar esse item?"
     * 5 - objeto que implementa "Iterator" responde: - "Est� aqui, pode pegar" 
     * 6 - "Loop / Itera��o acontece"
     * 7 - Processo segue at� que o objeto que implementa "Iterator" responda ao forEach que n�o tem mais pr�ximo item I 
     * */
    @Override
    public Iterator<String> iterator() { // O <> � um espa�o gen�rico - aqui eu defino que ele vai trabalhar com String, logo <String>
        /*
         * Esse � nosso objeto que implementa Iterator sendo devolvido conforme o contrato com "Iterable" exige
         * Esse iterador � um atributo do nosso StringIteravel
         * */
        return iterador;
    }
}
