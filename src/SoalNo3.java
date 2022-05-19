import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        int [] n = { 12, 9, 13, 6 ,10, 4, 7, 2};
        int [] arr = new int [n.length];
        for (int i = 0; i < n.length; i++) {
            if (n[i]%3 != 0) {
                arr[i] = n[i];
            }
        }
        System.out.print(arr);
    }
}
