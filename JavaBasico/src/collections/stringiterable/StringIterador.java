package collections.stringiterable;

import java.util.Iterator;

/*
 * A classe StringIterador "implementa" a interface "Iterator" - sub-interface da "Iterable" explicada dentro da classe StringIteravel
 * A "Iterator" "prop�e as regras contratuais" de como um objeto deve "responder" �s perguntas que o forEach faz. Lembre-se do 
 * exemplo de conversa entre forEach e objeto dado dentro da classe StringIteravel:
 * 1 - Come�a o processo
 * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� tem um pr�ximo item dentro do seu banco de dados interno?"
 * 3 - objeto que implementa "Iterator" responde: - "Tenho"
 * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� pode me passar esse item?"
 * 5 - objeto que implementa "Iterator" responde: - "aqui est�, pode pegar"
 * 6 - "Loop / Itera��o acontece"
 * 7 - Processo segue at� que o objeto que implementa "Iterator" responda ao forEach que n�o tem mais pr�ximo item
 * */ 
public class StringIterador implements Iterator<String> {
    /*
     * Pense nisso como o banco de dados interno do nosso "Iterator", aqui eu salvo o array de strings
     * que o "Iterable" j� quebrou em partes e me devolveu pronto para uso
     * */
    private String[] bdInterno;
    
    /*
     * Pense nesse index como o "apontamento" de qual item do banco de dados estou lidando nesse momento
     * � como se a cada nova instancia de um Iterator destes, ele come�asse com esse apontador apontando para o come�o (0)
     * e voc� pudesse apontar para o pr�ximo (1) e enquanto esse objeto existir ele vai estar apontando para 1, depois 2
     * e da� por diante - Isso faz parte do "estado" de cada inst�ncia desse nosso Iterator 
     * */
    private int index = 0;
    
    // Construtor
    public StringIterador(String[] stringsQuebrasEProntasPraUso) {
        // Aqui j� recebemos o array de strings preparado e pronto pra uso, ent�o ele s� � salvo no banco de dados interno
        this.bdInterno = stringsQuebrasEProntasPraUso;
    }
    
    /*
     * Esse m�todo, implementado para cumprir as regras contratuais do "Iterator", � o local que responde ao forEach 
     * se tem um pr�ximo objeto no seu banco de dados. Passo 3:
     * 2 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� tem um pr�ximo item dentro do seu banco de dados interno?"
     * 3 - OBJETO QUE IMPLEMENTA "ITERATOR" RESPONDE: - "Tenho" 
     * */
    @Override
    public boolean hasNext() {
        return this.index < this.bdInterno.length; // true/false -----> 3 - Tenho ou n�o tenho
    }

    /*
     * Esse m�todo, implementado para cumprir as regras contratuais do "Iterator", � o local que responde ao forEach 
     * lhe entregando o pr�ximo item. Passo 5:
     * 4 - forEach pergunta ao objeto que implementa "Iterator": - "Voc� pode me passar esse item?"
     * 5 - OBJETO QUE IMPLEMENTA "ITERATOR" RESPONDE: - "aqui est�, pode pegar" 
     * */
    @Override
    public String next() {
        return this.bdInterno[index++]; // 5 - Aqui est�, pode pegar essa String que � a pr�xima do meu banco de dados
    }
}
