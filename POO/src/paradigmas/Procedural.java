package paradigmas;

public class Procedural {
    
    // Dado um array desordenado, imprima o array desordenado,
    // ordene-o e imprima novamente a sua versão ordenada.
    
    public static void main(String[] args) {
        System.out.println("Procedural");
        
        int[] array = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
        
        printArray("Array original ", array);
        sortArray(array);
        printArray("Array ordenado ", array);
    }
    
    static void printArray(String titulo, int[] arr) {
        System.out.print(titulo);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < (arr.length - i - 1); i2++) {
                if (arr[i2] > arr[i2 + 1]) {
                    int temp = arr[i2];
                    arr[i2] = arr[i2 + 1];
                    arr[i2 + 1] = temp;
                }
            }
        }
    }
}
