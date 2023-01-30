package paradigmas;

import java.util.Arrays;

public class Funcional {

    // Dado um array desordenado, imprima o array desordenado,
    // ordene-o e imprima novamente a sua versão ordenada.
    
    public static void main(String[] args) {
        System.out.println("Funcional");
        
        int[] array = { 0, 20, 10, 12, 6, 16, 2, -2, 14, 4, 8, 18 };
        
        System.out.println("Array original: " + Arrays.toString(array));
        int[] resultArray = sortArray(array);
        System.out.println("Array ordenado: " + Arrays.toString(resultArray));
    }
    
    static int[] sortArray(int[] arr) {
        int[] resultArray = arr.clone();
        for (int i = 0; i < resultArray.length; i++) {
            for (int i2 = 0; i2 < (resultArray.length - i - 1); i2++) {
                if (resultArray[i2] > resultArray[i2 + 1]) {
                    int temp = resultArray[i2];
                    resultArray[i2] = resultArray[i2 + 1];
                    resultArray[i2 + 1] = temp;
                }
            }
        }
        return resultArray;
    }
}
