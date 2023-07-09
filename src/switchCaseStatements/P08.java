package switchCaseStatements;

import java.util.Scanner;

public class P08 {

    // Bir öğrencinin notunu kullanıcıdan alan ve aşağıdaki not aralıklarına göre
    // harf notunu ekrana yazdıran bir program yazınız:

    //90-100 arası: AA
    //80-89 arası: BA
    //70-79 arası: BB
    //60-69 arası: CB
    //50-59 arası: CC
    //0-49 arası: FF

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu girin: ");

        int not = scanner.nextInt();

        switch (not / 10) {

            case 10:
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("BA");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("CB");
                break;
            case 5:
                System.out.println("CC");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("FF");
                break;

            default:
                System.out.println("Geçersiz not girdiniz!");

        }


    }
}
