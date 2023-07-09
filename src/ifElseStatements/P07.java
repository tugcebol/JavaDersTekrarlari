package ifElseStatements;

import java.util.Scanner;

public class P07 {

    // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
    // sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
    // “istediginiz birim sisteme kayitli degil” yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen mesafeyi km cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.println("Çevirmek istediğiniz birimi girin: \n(m/cm)");
        char birim = scanner.next().toLowerCase().charAt(0);

        if (birim == 'm') System.out.println("Mesafe metre cinsinden " + (mesafe*1000) + " metredir.");
        else if (birim == 'c') System.out.println("Mesafe santimetre cinsinden " + (mesafe*100000) + " cmdir.");
        else System.out.println("İstediginiz birim sisteme kayitli degil");

    }
}
