package misc;

import java.util.Scanner;

public class SayiTahminOyunu {

    //    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    //    Bu sayi fazla ise "Cok soyledin dusur", az ise "Dusuk soyledin arttir."
    //    bilince de tebrik edip durduran bir kod yazalim

    public static void main(String[] args) {

        int sayi = 50;
        int tahmin = 0;
        Scanner scanner;
        System.out.println("Lütfen bir tahminde bulunun.");
        while (tahmin != sayi) {
            System.out.print("Tahmin: ");
            scanner = new Scanner(System.in);
            tahmin = scanner.nextInt();
            if (tahmin < sayi) {
                System.out.println("Düşük tahmin, lütfen tahmininizi arttırın.");
                continue;
            } else if (tahmin > sayi) {
                System.out.println("Yüksek tahmin, lütfen tahmininizi azaltın.");
                continue;
            } else if (tahmin == sayi) {
                System.out.println("Doğru tahmin! Tebrikler...");
                break;
            }
        }
    }
}
