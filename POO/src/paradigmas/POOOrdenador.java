package paradigmas;

public class POOOrdenador {
    public void sortArray(int[] arr) {
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
