package switchCaseStatements;

import java.util.Scanner;

public class P03 {

    // Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir rakam girin: ");
        char rakam = scanner.next().charAt(0);


        switch (rakam){

            case '0':
                System.out.println("Sıfır");
                break;
            case '1':
                System.out.println("Bir");
                break;
            case '2':
                System.out.println("İki");
                break;
            case '3':
                System.out.println("Üç");
                break;
            case '4':
                System.out.println("Dört");
                break;
            case '5':
                System.out.println("Beş");
                break;
            case '6':
                System.out.println("Altı");
                break;
            case '7':
                System.out.println("Yedi");
                break;
            case '8':
                System.out.println("Sekiz");
                break;
            case '9':
                System.out.println("Dokuz");
                break;

            default:
                System.out.println("Geçersiz giriş!");
        }


    }
}
