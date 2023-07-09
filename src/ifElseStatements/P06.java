package ifElseStatements;

import java.util.Scanner;

public class P06 {

    // Kullanicidan aldigi urun adedi ve liste fiyatini alin, kullaniciya musteri
    // karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
    // %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
    // alirsa %15, yoksa %10 indirim yapin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen aldığınız ürün adedini girin: ");
        int adet = scanner.nextInt();

        System.out.println("Lütfen ürünün fiyatını girin: ");
        double fiyat = scanner.nextDouble();

        System.out.println("Müşteri kartına sahip misiniz? \nE: EVET H: HAYIR");
        char kart = scanner.next().toUpperCase().charAt(0);


        if (kart == 'E') {
            if (adet > 10) System.out.println(((adet * fiyat) * 0.8) + " $ ödemeniz gerekli.");
            else if (adet <= 10) System.out.println(((adet * fiyat) * 0.85) + " $ ödemeniz gerekli.");
        } else if (kart == 'H') {
            if (adet > 10) System.out.println(((adet * fiyat) * 0.85) + " $ ödemeniz gerekli.");
            else if (adet <= 10) System.out.println(((adet * fiyat) * 0.9) + " $ ödemeniz gerekli.");
        } else System.out.println("Geçersiz giriş!");


    }
}
