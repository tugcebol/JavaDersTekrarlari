package ifElseStatements;

import java.util.Scanner;

public class P03 {

    // Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
    // olup olmadigini yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin: ");
        char girilenKrk = scanner.next().charAt(0);

        if(girilenKrk >= 'A' && girilenKrk <= 'Z') System.out.println("Büyük harf girdiniz");
        else System.out.println("Büyük harf değil.");
    }
}
