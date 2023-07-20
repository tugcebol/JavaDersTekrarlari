package whileLoop;

import java.util.Scanner;

public class P06 {

    // Kullanıcıdan toplamak üzere pozitif sayılar isteyin
    // kullanıcı işlemi bitirmek icin 0'a basmalıdır
    // kullanıcı 0'a bastıgında kaç pozitif sayı girdiğini
    // ve toplamlarının kaç olduğunu yazdırın

    public static void main(String[] args) {

        Scanner scanner;
        int sayi = 1;
        int toplam = 0;
        int sayac = 0;
        int kacinci = 1;

        System.out.print("Lütfen toplamak istediğiniz pozitif tam sayıyı girin: ");
        System.out.println("");

        while (sayi != 0) {

            System.out.print(kacinci + ". sayı: ");
            scanner = new Scanner(System.in);
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac++;
            kacinci++;

            if (sayi == 0) {
                System.out.println(sayac + " adet sayı girdiniz. Sayıların toplamı: " + toplam);
            }
        }


    }
}
