package collections.stringiterable;

import java.util.Iterator;

/*
 * A classe StringIteravel "implementa" a interface "Iterable" - interface pertencente à API de Collections do Java 
 * que "propõe as regras contratuais" de como os seus implementantes devem fazer para que adquiram o "poder" de 
 * serem iterados por forEachs 
 * */
public class StringIteravel implements Iterable<String> { // O <> é um espaço genérico - aqui eu defino que ele vai trabalhar com String, logo <String>
    // Pense nisso como o banco de dados interno do nosso "Iterable", aqui eu salvo a string original como ela chegou
    private String stringOriginal;
    
    /*
     * A classe StringIterador é a responsável por resolver o problema de criar o Iterator que o contrato com "Iterable" exige em um 
     * método abaixo 
     * */
    private StringIterador iterador;
    
    // Construtor
    public StringIteravel(String stringOriginal) {
        // Apenas salvo a string original no meu estado, para ter isso no futuro se precisar
        this.stringOriginal = stringOriginal;
        
        /*
         * Aqui eu instancio então um Iterator no meu atributo de estado, e já passo
         * o resultado da string original quebrada certinho em pedaços e transformada em array
         * pelo construtor dele 
         * */
        this.iterador = new StringIterador(this.stringOriginal.trim().replace(" ", "").split(","));
    }
    
    /*
     * Aqui estou cumprindo com as regras contratuais do "Iterable". Ele me diz que eu preciso de um objeto que, por sua vez,
     * cumpra com as regras contratuais da interface "Iterator" - sub-interface do Iterable que dita as "regras contratuais" de
     * como os seus implementantes devem fazer para fazer a comunicação com o forEach. Exemplo.:
     * 1 - Começa o processo
     * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Você tem um próximo item dentro do seu banco de dados interno?"
     * 3 - objeto que implementa "Iterator" responde: - "Tenho"
     * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Você pode me passar esse item?"
     * 5 - objeto que implementa "Iterator" responde: - "Está aqui, pode pegar" 
     * 6 - "Loop / Iteração acontece"
     * 7 - Processo segue até que o objeto que implementa "Iterator" responda ao forEach que não tem mais próximo item I 
     * */
    @Override
    public Iterator<String> iterator() { // O <> é um espaço genérico - aqui eu defino que ele vai trabalhar com String, logo <String>
        /*
         * Esse é nosso objeto que implementa Iterator sendo devolvido conforme o contrato com "Iterable" exige
         * Esse iterador é um atributo do nosso StringIteravel
         * */
        return iterador;
    }
}
