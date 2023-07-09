package switchCaseStatements;

import java.util.Scanner;

public class P07 {

    // Kullanıcıdan bir harf girişi alan ve girilen harfin sesli harf mi yoksa
    // sessiz harf mi olduğunu kontrol eden bir program yazınız.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir harf girin: ");

        char harf = scanner.next().toLowerCase().charAt(0);

        switch (harf) {

            case 'a':
            case 'e':
            case 'ı':
            case 'i':
            case 'o':
            case 'ö':
            case 'u':
            case 'ü':
                System.out.println("Sesli harf");
                break;
            default:
                System.out.println("Sessiz harf");


        }





    }


}
