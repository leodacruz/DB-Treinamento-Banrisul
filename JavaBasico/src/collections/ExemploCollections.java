package collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploCollections {

    public static void main(String[] args) {
        manipularList();
        
        System.out.println();
        
        manipularDeque();
        
        System.out.println();
        
        manipularMap();
    }
    
    public static void manipularList() {
        /*
         * Segundo o diagrama visto em aula, ArrayList est� na hierarquia de implementa��o da interface List
         * e � por isso que � possivel criar um List<Integer> preenchendo o com um novo ArrayList<Integer>
         * */
        List<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(30); // Adicionando um n�mero duplicado (isso � permitido nas listas)
        
        numeros.set(2, 25); // Alterando dinamicamente o �ndice 2 e alterando o seu conte�do de 30 para 25 (isso � permitido nas listas)
        numeros.remove(1); // Removendo o �ndice 1 do meio da lista, o que vai afetar todos os que sucedem (isso � permitido nas listas)
        
        System.out.println("List tem -> " + numeros);
        
        System.out.println("No �ndice 1 dele est� -> " + numeros.get(1));
    }
    
    public static void manipularDeque() {
        /*
         * Segundo o diagrama visto em aula, LinkedList est� na hierarquia de implementa��o da interface Deque
         * e � por isso que � possivel criar um Deque<String> preenchendo o com um novo LinkedList<String>
         * */
        Deque<String> participantes = new LinkedList<String>();
        
        participantes.add("1st");
        participantes.add("2nd");
        participantes.add("3rd");
        participantes.add("4th");
        participantes.add("5th");
        
        System.out.println("Deque tem -> " + participantes);
        
        // Roda enquanto a fila de participantes n�o for esvazeada
        while(!participantes.isEmpty()) {
            String quemSaiu = participantes.removeFirst();
            
            System.out.println(quemSaiu + " saiu da fila");
        }
        
        System.out.println("Deque tem -> " + participantes);
    }
    
    public static void manipularMap() {
        /*
         * Segundo o diagrama visto em aula, HashMap est� na hierarquia de implementa��o da interface Map
         * e � por isso que � possivel criar um Map<String, String> preenchendo o com um novo HashMap<String, String>
         * ----------------------------------------------------------------------------------------------------------
         * Com a mesma l�gica de generics, aqui usandos <String, String> justamente porque essa classe
         * � capaz de manipular n�o s� uma, mas duas Strings internamente, no formato de chave e valor
         * */
        Map<String, String> dados = new HashMap<String, String>();
        
        // A classe HashMap n�o garante ordenamento da lista, logo a impress�o pode aparecer diferente da ordem de inser��o
        dados.put("Nome", "Eddie");
        dados.put("Sobrenome", "Murphy");
        dados.put("Idade", "62");
        dados.put("RG", "9889899889");
        
        /*
         * Classes da hierarquia Map n�o implementam diretamente a Iterable, logo n�o possuem a mesma caracter�stica
         * que todas as classes advindas de Iterable tem, de serem naturalmente preparadas para serem iteradas com
         * um forEach. Logo, precisa-se usar um m�todo especial criado na classe para que esse m�todo retorne uma 
         * vers�o "iter�vel", nesse caso um Set (esse sim, estando na hierarquia de Iterable)
         * */
        Set<Map.Entry<String, String>> dadosIteraveis = dados.entrySet();
        
        // Agora sim, usando uma classe iter�vel, podemos colocar no array
        for (Map.Entry<String, String> dado: dadosIteraveis) {
            System.out.printf("%s: %s \n", dado.getKey(), dado.getValue());
        }
    }
}
