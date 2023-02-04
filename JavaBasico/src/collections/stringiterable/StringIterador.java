package collections.stringiterable;

import java.util.Iterator;

/*
 * A classe StringIterador "implementa" a interface "Iterator" - sub-interface da "Iterable" explicada dentro da classe StringIteravel
 * A "Iterator" "propõe as regras contratuais" de como um objeto deve "responder" às perguntas que o forEach faz. Lembre-se do 
 * exemplo de conversa entre forEach e objeto dado dentro da classe StringIteravel:
 * 1 - Começa o processo
 * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Você tem um próximo item dentro do seu banco de dados interno?"
 * 3 - objeto que implementa "Iterator" responde: - "Tenho"
 * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Você pode me passar esse item?"
 * 5 - objeto que implementa "Iterator" responde: - "aqui está, pode pegar"
 * 6 - "Loop / Iteração acontece"
 * 7 - Processo segue até que o objeto que implementa "Iterator" responda ao forEach que não tem mais próximo item
 * */ 
public class StringIterador implements Iterator<String> {
    /*
     * Pense nisso como o banco de dados interno do nosso "Iterator", aqui eu salvo o array de strings
     * que o "Iterable" já quebrou em partes e me devolveu pronto para uso
     * */
    private String[] bdInterno;
    
    /*
     * Pense nesse index como o "apontamento" de qual item do banco de dados estou lidando nesse momento
     * É como se a cada nova instancia de um Iterator destes, ele começasse com esse apontador apontando para o começo (0)
     * e você pudesse apontar para o próximo (1) e enquanto esse objeto existir ele vai estar apontando para 1, depois 2
     * e daí por diante - Isso faz parte do "estado" de cada instância desse nosso Iterator 
     * */
    private int index = 0;
    
    // Construtor
    public StringIterador(String[] stringsQuebrasEProntasPraUso) {
        // Aqui já recebemos o array de strings preparado e pronto pra uso, então ele só é salvo no banco de dados interno
        this.bdInterno = stringsQuebrasEProntasPraUso;
    }
    
    /*
     * Esse método, implementado para cumprir as regras contratuais do "Iterator", é o local que responde ao forEach 
     * se tem um próximo objeto no seu banco de dados. Passo 3:
     * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Você tem um próximo item dentro do seu banco de dados interno?"
     * 3 - OBJETO QUE IMPLEMENTA "ITERATOR" RESPONDE: - "Tenho" 
     * */
    @Override
    public boolean hasNext() {
        return this.index < this.bdInterno.length; // true/false -----> 3 - Tenho ou não tenho
    }

    /*
     * Esse método, implementado para cumprir as regras contratuais do "Iterator", é o local que responde ao forEach 
     * lhe entregando o próximo item. Passo 5:
     * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Você pode me passar esse item?"
     * 5 - OBJETO QUE IMPLEMENTA "ITERATOR" RESPONDE: - "aqui está, pode pegar" 
     * */
    @Override
    public String next() {
        return this.bdInterno[index++]; // 5 - Aqui está, pode pegar essa String que é a próxima do meu banco de dados
    }
}
