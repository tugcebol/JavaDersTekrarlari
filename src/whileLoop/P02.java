package whileLoop;

import java.util.Scanner;

public class P02 {

    // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen rakamlar toplamını bulmak istediğiniz tam sayıyı girin: ");
        int sayi = scanner.nextInt();
        int birlerBasamagi = 0;
        int toplam = 0;


        while (sayi > 0) {

            birlerBasamagi = sayi % 10;
            toplam += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("Rakamlar toplamı: " + toplam);


    }

}
