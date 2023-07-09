package StringManipulations;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {

        // Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        // icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir string girin: ");
        String str = scanner.nextLine();

        System.out.print("Aramak istediğiniz metni girin: ");
        String aranacakMetin = scanner.nextLine();

        if (str.indexOf(aranacakMetin) != -1) {
            System.out.println("\'" + aranacakMetin + "\'" + " metni girilen String'in " + str.indexOf(aranacakMetin) + ". indexinden başlıyor.");
        } else {
            System.out.println("Aranan metin String içinde yok!");
        }

    }
}
