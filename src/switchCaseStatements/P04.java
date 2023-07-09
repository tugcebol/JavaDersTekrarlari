package switchCaseStatements;

import java.util.Scanner;

public class P04 {

    // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki basamaklı bir sayı girin: ");

        int sayi = scanner.nextInt();

        int birler = sayi % 10;
        int onlar = sayi / 10;

        switch (onlar) {

            case 1:
                System.out.print("On");
                break;

            case 2:
                System.out.print("Yirmi");
                break;

            case 3:
                System.out.print("Otuz");
                break;

            case 4:
                System.out.print("Kırk");
                break;

            case 5:
                System.out.print("Elli");
                break;

            case 6:
                System.out.print("Altmış");
                break;

            case 7:
                System.out.print("Yetmiş");
                break;

            case 8:
                System.out.print("Seksen");
                break;

            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birler) {

            case 1:
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;

            case 3:
                System.out.println("üç");
                break;

            case 4:
                System.out.println("dört");
                break;

            case 5:
                System.out.println("beş");
                break;

            case 6:
                System.out.println("altı");
                break;

            case 7:
                System.out.println("yedi");
                break;

            case 8:
                System.out.println("sekiz");
                break;

            case 9:
                System.out.println("dokuz");
                break;

        }


    }
}
