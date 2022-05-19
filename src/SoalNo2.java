import java.util.Scanner;

public class SoalNo2 {
    public Scanner sc = new Scanner(System.in);
    public int getN() {
        System.out.print("\nMasukkan nilai n : ");
        int n = sc.nextInt();
        return n;
    }

    public void deret() {
        int panjang = getN();
        System.out.println("Hasil :");

        System.out.println("Pola A");
        for (int i = 0; i < panjang; i++) {
            for(int j = i; j >= 0; j--) {
                System.out.print(i+1);
            }
            System.out.println();
        }

        System.out.println("\nPola B");
        for(int i = 0; i < panjang; i++) {
            for(int j = i; j >= 0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        System.out.println("\nPola C");
        int a = 1;
        int b = 0;
        for(int i = 0; i < panjang; i++) {
            for(int j = i; j >= 0; j--) {
                if (a<5 & b==0) {
                    System.out.print(a);
                    a++;
                } else if (a==5 & b==0) {
                    System.out.print(a);
                    a--;
                    b = panjang-1;
                } else if (a<5 & b<panjang && b>0) {
                    System.out.print(b);
                    b--;
                }
            }
            System.out.println();
        }

        System.out.println("\nPola D");
        int a1 = 1;
        int a2 = 10;
        int a3 = 11;
        int a4 = 20;
        int a5 = 21;
        for(int i = 0; i < panjang; i++) {
            for(int j = 0; j < panjang; j++) {
                if (j == 0) {
                    System.out.print(a1 + " ");
                    a1++;
                } else if (j==1) {
                    System.out.print(a2 + " ");
                    a2--;
                } else if (j==2) {
                    System.out.print(a3 + " ");
                    a3++;
                } else if (j==3) {
                    System.out.print(a4 + " ");
                    a4--;
                } else if (j==4) {
                    System.out.print(a5 + " ");
                    a5++;
                }
            }
            System.out.println();
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
        System.out.println("  ==== PROGRAM 4 POLA ANGKA ====");
        SoalNo2 run = new SoalNo2();
        run.loop();
    }
}
