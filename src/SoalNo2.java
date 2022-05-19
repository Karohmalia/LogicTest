import java.util.Scanner;

public class SoalNo2 {
    private String[][] arr;
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
        int a = 0;
        int b = panjang;
        for(int i = 0; i < panjang; i++) {
            for(int j = i; j >= 0; j--) {
                if (a<5) {
                    System.out.print(a+1);
                    a++;
                } else if (a==5) {
                    System.out.print(a);
                    b--;
                } else if (b==1) {
                    System.out.println(b+1);
                }
            }
            System.out.println();
        }

//        System.out.println("\nPola D");
//        this.arr = new String[panjang][panjang];
//        for(int i = 0; i < panjang; i++) {
//            for(int j = 0; j < panjang; j++) {
//                if (j > i) {
//                    System.out.print(" ");
//                } else if (i >= j) {
//                    System.out.print(i+1);
//                }
//            }
//            System.out.println();
//        }

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
