import java.util.Scanner;

public class SoalNo1 {
    public Scanner sc = new Scanner(System.in);
    public int getN() {
        System.out.print("\nMasukkan nilai n : ");
        int n = sc.nextInt();
        return n;
    }

    public void deret() {
        int panjang = getN();
        System.out.println("Deret :");
        for (int i = 0; i < panjang; i++) {
            if ((i+1)%3 == 0 && (i+1)%4 == 0) {
                System.out.print("OKYES ");
            } else if ((i+1)%4 == 0) {
                System.out.print("YES ");
            } else if ((i+1)%3 == 0) {
                System.out.print("OK " );
            } else {
                System.out.print(i+1 + " ");
            }
        }
    }

    public void loop() {
        Boolean y = true;
        do {
            deret();
            System.out.print("\n\nApakah ingin mencoba kembali? (Y/N) : ");
            String coba = sc.next();
            if (coba.equalsIgnoreCase("y")) {
                y = true;
            } else {
                y = false;
            }
        } while (y);
        System.out.println("\nTerima kasih telah menjalankan program :)");
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("  ==== PROGRAM ALGORITMA ANGKA ====");
        SoalNo1 run = new SoalNo1();
        run.loop();
    }
}
