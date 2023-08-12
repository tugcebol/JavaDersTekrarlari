package forEachLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeDersi03 {

    // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
    // Bu notların ortalamasını hesaplayarak ekrana yazdırın.
    // Örnek çıktı:
    // Notların ortalaması: 78.5

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İstenen not bilgilerini sırasıyla giriniz:");

        ArrayList<Double> notlar = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.print((i+1) + ". not: ");
            double not = scanner.nextDouble();
            notlar.add(not);
        }
        int toplam = 0;
        for (double not:notlar
        ) { toplam += not;
        }
        double notOrtalamasi = toplam / 5.0;

        System.out.println("Girilen notların ortalaması: " + notOrtalamasi);

    }
}
