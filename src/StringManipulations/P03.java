package StringManipulations;

import java.util.Scanner;

public class P03 {

    // Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
    // icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
    // - String aranan metni icermiyor
    // - Aranan metin String’de sadece 1 kere kullanilmis
    // - Aranan metin String’de sadece 1’den fazla kullanilmis

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir string girin: ");
        String str = scanner.nextLine();

        System.out.print("Aramak istediğiniz metni girin: ");
        String aranacakMetin = scanner.nextLine();

        int ilkIndex = str.indexOf(aranacakMetin);
        int sonIndex = str.lastIndexOf(aranacakMetin);

        if (str.indexOf(aranacakMetin) == -1) {
            System.out.println("String aranan metni içermiyor!");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Aranan metin String'de sadece bir kere kullanılmış.");
        } else {
            System.out.println("Aranan metin String'de birden fazla kullanılmış");
        }



    }


}
