package switchCaseStatements;

import java.util.Scanner;

public class P02 {

    // Kullanıcıdan 2 sayı alın ve kullanıcıya istediği işlemi sorun
    // +,-,*,/ işaretlerinden hangisini girerse
    // 2 sayı için o işlemi yapın
    // bu işaretlerden birini girmezse, "yanlış işlem tercihi" yazdırın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayı girin: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi girin: \n(+,-,*,/)");
        char islem = scanner.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;

            case '-':
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;

            case '*':
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;

            case '/':
                System.out.println("Sonuç: " + (sayi1 / sayi2));
                break;

            default:
                System.out.println("Yanlış karakter girişi!");
        }


    }
}
