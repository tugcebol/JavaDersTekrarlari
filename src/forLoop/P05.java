package forLoop;

import java.util.Scanner;

public class P05 {

    // 100'den büyük ilk 10 asal sayıyı yazdırın

    public static void main(String[] args) {


        int sayac = 0;
        boolean asalMi = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
        int sayi = scanner.nextInt();

        if (sayi < 2) {
            System.out.println("Asal değil");
        }

        else {
            for (int i = 2; i <sayi ; i++) {

            }
        }

    }
}
