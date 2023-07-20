package whileLoop;

import java.util.Scanner;

public class P05 {

    // Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
    // kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
    // olusturun.


    public static void usHesaplama (double sayi, int us){

         double sonuc = 1;
         int girilenUs = 1;
         girilenUs = us;

         while (girilenUs>=1){

             sonuc *= sayi;
             girilenUs--;
         }

        System.out.println(sayi + " sayının " + us + ". üssü = " + sonuc);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen üssünü hesaplamak istediğiniz sayıyı girin: ");
        double sayi = scanner.nextDouble();
        System.out.print("Lütfen şimdi de üs değeri girin: ");
        int us = scanner.nextInt();

        usHesaplama(sayi,us);

    }
}
