package forLoop;

import java.util.Scanner;

public class P09 {

    // Soru 2: Kullanıcıdan bir sayı girişi alın ve
    //         1'den o sayıya kadar olan tek sayıları ekrana yazdırın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print("1'den " + sayi + "'e kadar olan tek sayılar: ");
        for (int i = 1; i < sayi; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
