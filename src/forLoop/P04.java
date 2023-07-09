package forLoop;

import java.util.Scanner;

public class P04 {

    // Kullanıcıdan alınan pozitif tamsayının asal olup olmadığını yazdırın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif tamsayı girin: ");
        int sayi = scanner.nextInt();

        boolean asal = true;

        if (sayi <= 1) {
            asal = false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal == false) {
            System.out.println("Asal sayı değil");
        } else {
            System.out.println("Asal sayı");
        }
    }
}
