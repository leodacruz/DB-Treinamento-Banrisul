package paradigmas;

public class POOImpressora {
    public void printArray(String titulo, int[] arr) {
        System.out.print(titulo); 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
