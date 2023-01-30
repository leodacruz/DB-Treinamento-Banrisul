package paradigmas;

public class POO {

    // Dado um array desordenado, imprima o array desordenado,
    // ordene-o e imprima novamente a sua versão ordenada.
    
    // Impressora -> Imprime arrays
    // Ordenador -> Ordena arrays
    
    public static void main(String[] args) {
        System.out.println("POO");
       
        int[] array = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
       
        POOImpressora printer = new POOImpressora();
        
        printer.printArray("Array original ", array);
        new POOOrdenador().sortArray(array);
        printer.printArray("Array ordenado ", array);
    }
}
