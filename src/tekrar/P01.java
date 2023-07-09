package tekrar;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayı girin");
        System.out.print("Sayi 1: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Sayi 2: ");
        int sayi2 = scanner.nextInt();

        System.out.println("SWAP!");

        int temp = sayi1;

        sayi1 = sayi2;

        sayi2 = temp;

        System.out.println("Sayı 1: " + sayi1 + "\nSayi 2: " + sayi2);

        System.out.println("Lütfen iki sayı girin");
        System.out.print("Sayi A: ");
        int sayiA = scanner.nextInt();
        System.out.print("Sayi B: ");
        int sayiB = scanner.nextInt();

        System.out.println("SWAP!");

        sayiA = sayiA + sayiB;
        sayiB = sayiA - sayiB;
        sayiA = sayiA - sayiB;

        System.out.println("Sayi A: " + sayiA + "\nSayi B: " + sayiB);




    }
}
