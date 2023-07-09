package StringManipulations;

import java.util.Scanner;

public class P09 {

    // Kullanicidan isim ve soyismini ayri ayri alin.
    // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
    // yazdirin
    // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
    // harflerle yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen isminizi girin: ");
        String isim = scanner.nextLine();

        System.out.print("Lütfen soyisminizi girin: ");
        String soyIsim = scanner.nextLine();

        int isimUzunluk = isim.length();
        int soyIsimUzunluk = soyIsim.length();

        if (isimUzunluk > soyIsimUzunluk) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) +
                    " " +
                    soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));
        } else {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) +
                    " " +
                    soyIsim.toUpperCase());
        }


    }

}
