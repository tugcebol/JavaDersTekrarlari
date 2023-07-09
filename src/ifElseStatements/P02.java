package ifElseStatements;

import java.util.Scanner;

public class P02 {

    // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
    // yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin,

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        if (yas >=65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olmaya daha " + (65-yas) + " yıl var.");

    }
}
