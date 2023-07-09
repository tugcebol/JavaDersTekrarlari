package ifElseStatements;

import java.util.Scanner;

public class P04 {

    // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
    // olarak yazdirin, yoksa girilen harfi yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir harf girin: ");
        char harf = scanner.next().charAt(0);

        if (harf >= 'a' && harf <= 'z') System.out.println((char)(harf - 32));
        else if (harf >= 'A' && harf<='Z') System.out.println(harf);
        else System.out.println("Geçersiz karakter girdiniz!");


    }
}
