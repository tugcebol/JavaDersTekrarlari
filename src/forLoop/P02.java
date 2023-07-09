package forLoop;

import java.util.Scanner;

public class P02 {

    // Kullanıcıdan iki sayı alın ve bu sayılar arasındaki (sınırlar dahil) 3 ile bölünebilen sayıları yazdırın,
    // ilk girilen sayı ikinci sayıdan büyük ise hata mesajı yazdırın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayı girin: ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 < sayi1) {
            System.out.println("İlk sayı küçük olmalıdır! ");
        } else {
            for (int i = sayi1; i <= sayi2; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
