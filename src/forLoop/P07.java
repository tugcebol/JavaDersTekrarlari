package forLoop;

import java.util.Scanner;

public class P07 {

    // Kullanıcıdan pozitif tam sayı değerleri alın ve toplayın
    // toplam 500'e ulaştığında, ya da kullanıcı '0' değerini girdiğinde
    // kod çalışmayı durdursun ve toplamı consolda yazdırsın


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (; ; ) {
            System.out.print("Bir tam sayı girin (Çıkmak için 0 girin): ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;  // Kullanıcı 0 girdiğinde döngüyü sonlandırır
            }

            toplam += sayi;

            if (toplam >= 500) {
                break;  // Toplam 500 veya daha fazla olduğunda döngüyü sonlandırır
            }
        }

        System.out.println("Toplam: " + toplam);
    }
}

