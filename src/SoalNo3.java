import java.util.Arrays;
import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};
        System.out.println(Arrays.toString(n));

        int temp;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j + 1];
                    n[j + 1] = n[j];
                    n[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(n));

        int[] arr = new int[8];
        for (int i = 0; i < n.length; i++) {
            if (n[i]%3 != 0) {
                arr[i] = n[i];
            }
        }
//        System.out.println(Arrays.toString(arr));

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = arr[i];
            }
            array[2] = arr[3];
            array[3] = arr[5];
            array[4] = arr[7];
        }
        System.out.println(Arrays.toString(array));
    }
}
