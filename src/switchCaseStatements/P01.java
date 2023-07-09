package switchCaseStatements;

import java.util.Scanner;

public class P01 {

    // Kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir harf girin: ");

        char harf = scanner.next().toLowerCase().charAt(0);

        switch (harf) {

            case 'o':
                System.out.println("Ocak");
                break;

            case 's' :
                System.out.println("Şubat");
                break;

            case 'm':
                System.out.println("Mart - Mayıs");
                break;

            case 'n' :
                System.out.println("Nisan");
                break;

            case 'h':
                System.out.println("Haziran");
                break;

            case 't' :
                System.out.println("Temmuz");
                break;

            case 'a':
                System.out.println("Ağustos - Aralık");
                break;

            case 'e' :
                System.out.println("Eylül - Ekim");
                break;

            case 'k':
                System.out.println("Kasım");
                break;

            default:
                System.out.println("Geçersiz harf");


        }






    }
}
