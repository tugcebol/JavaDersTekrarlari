package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeDersi02 {

    // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
    // Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.

    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplanacak sayıları giriniz:");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayı: ");
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
        }
        int toplam = 0;
        for (int sayi : sayilar
        ) {
            toplam += sayi;
        }
        System.out.println("Sayıların toplamı: " + toplam);
    }

}
