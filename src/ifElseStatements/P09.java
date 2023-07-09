package ifElseStatements;

import java.util.Scanner;

public class P09 {

    // Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
    // oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
    // yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 != 0)
            if (sayi>0) System.out.println("Pozitif tek sayı");
            else System.out.println("Negatif tek sayı");
        else
            if (sayi % 10 == 0 && sayi != 0 ) System.out.println("10'un katı");
            else System.out.println("10'un katı değil");
    }

}
