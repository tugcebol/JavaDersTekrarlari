package forLoop;

import java.util.Scanner;

public class P06 {

    // Kullanıcıdan pozitif tam sayı değerleri alın ve toplayın
    // toplam 500'e ulaştığında kod çalışmayı durdursun ve toplamı consolda yazdırsın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (; ; ) {
            System.out.print("Bir tam sayı girin: ");
            int sayi = scanner.nextInt();

            toplam += sayi;

            if (toplam >= 500) {
                break;
            }
        }

        System.out.println("Toplam: " + toplam);
    }
}


