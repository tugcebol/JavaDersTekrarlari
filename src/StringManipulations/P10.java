package StringManipulations;

import java.util.Scanner;

public class P10 {

    // Kullanicidan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
    // :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
    // yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir kelime girin: ");
        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();

        if (uzunluk%2==0){
            System.out.println(kelime.substring(0,(uzunluk/2)) + ":)" + kelime.substring((uzunluk/2)));
        }else {
            System.out.println(kelime.substring(0,(uzunluk/2)) + ":)" + kelime.substring(((uzunluk/2)+1)));
        }

    }

}
