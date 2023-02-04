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
         * Segundo o diagrama visto em aula, ArrayList está na hierarquia de implementação da interface List
         * e é por isso que é possivel criar um List<Integer> preenchendo o com um novo ArrayList<Integer>
         * */
        List<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(30); // Adicionando um número duplicado (isso é permitido nas listas)
        
        numeros.set(2, 25); // Alterando dinamicamente o índice 2 e alterando o seu conteúdo de 30 para 25 (isso é permitido nas listas)
        numeros.remove(1); // Removendo o índice 1 do meio da lista, o que vai afetar todos os que sucedem (isso é permitido nas listas)
        
        System.out.println("List tem -> " + numeros);
        
        System.out.println("No índice 1 dele está -> " + numeros.get(1));
    }
    
    public static void manipularDeque() {
        /*
         * Segundo o diagrama visto em aula, LinkedList está na hierarquia de implementação da interface Deque
         * e é por isso que é possivel criar um Deque<String> preenchendo o com um novo LinkedList<String>
         * */
        Deque<String> participantes = new LinkedList<String>();
        
        participantes.add("1st");
        participantes.add("2nd");
        participantes.add("3rd");
        participantes.add("4th");
        participantes.add("5th");
        
        System.out.println("Deque tem -> " + participantes);
        
        // Roda enquanto a fila de participantes não for esvazeada
        while(!participantes.isEmpty()) {
            String quemSaiu = participantes.removeFirst();
            
            System.out.println(quemSaiu + " saiu da fila");
        }
        
        System.out.println("Deque tem -> " + participantes);
    }
    
    public static void manipularMap() {
        /*
         * Segundo o diagrama visto em aula, HashMap está na hierarquia de implementação da interface Map
         * e é por isso que é possivel criar um Map<String, String> preenchendo o com um novo HashMap<String, String>
         * ----------------------------------------------------------------------------------------------------------
         * Com a mesma lógica de generics, aqui usandos <String, String> justamente porque essa classe
         * é capaz de manipular não só uma, mas duas Strings internamente, no formato de chave e valor
         * */
        Map<String, String> dados = new HashMap<String, String>();
        
        // A classe HashMap não garante ordenamento da lista, logo a impressão pode aparecer diferente da ordem de inserção
        dados.put("Nome", "Eddie");
        dados.put("Sobrenome", "Murphy");
        dados.put("Idade", "62");
        dados.put("RG", "9889899889");
        
        /*
         * Classes da hierarquia Map não implementam diretamente a Iterable, logo não possuem a mesma característica
         * que todas as classes advindas de Iterable tem, de serem naturalmente preparadas para serem iteradas com
         * um forEach. Logo, precisa-se usar um método especial criado na classe para que esse método retorne uma 
         * versão "iterável", nesse caso um Set (esse sim, estando na hierarquia de Iterable)
         * */
        Set<Map.Entry<String, String>> dadosIteraveis = dados.entrySet();
        
        // Agora sim, usando uma classe iterável, podemos colocar no array
        for (Map.Entry<String, String> dado: dadosIteraveis) {
            System.out.printf("%s: %s \n", dado.getKey(), dado.getValue());
        }
    }
}
