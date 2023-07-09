package switchCaseStatements;

import java.util.Scanner;

public class P05 {

    // Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
    // ve girilen harfin karsiligini yazdirin.
    // I : International S : Software T : Testing Q : Qualifications B: Board

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen öğrenmek istediğiniz harfi girin: \nI, S, T, Q, B");
        char harf = scanner.next().toUpperCase().charAt(0);

        switch (harf){

            case 'I':
                System.out.println("I : International");
                break;

            case 'S':
                System.out.println("S : Software");
                break;

            case 'T':
                System.out.println("T : Testing");
                break;

            case 'Q':
                System.out.println("Q : Qualifications");
                break;

            case 'B':
                System.out.println("B: Board");
                break;

            default:
                System.out.println("Geçersiz harf!");
        }
    }
}
