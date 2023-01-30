package paradigmas;

public class Imperativo {

    // Dado um array desordenado, imprima o array desordenado,
    // ordene-o e imprima novamente a sua versão ordenada.
    
    public static void main(String[] args) {
        System.out.println("Imperativo");
        int[] array = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 }; // Problema
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < (array.length - i - 1); i2++) {
                if (array[i2] > array[i2 + 1]) {
                    int temp = array[i2];
                    array[i2] = array[i2 + 1];
                    array[i2 + 1] = temp;
                }
            }
        }
        System.out.print("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
