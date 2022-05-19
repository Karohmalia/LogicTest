import java.util.Arrays;
import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        int [] n = { 12, 9, 13, 6 ,10, 4, 7, 2};
        int temp;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] < n[j] && n[i]%3 != 0) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(n));
    }
}
