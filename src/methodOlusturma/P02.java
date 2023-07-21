package methodOlusturma;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir String girin: ");
        String str = scanner.nextLine();

        P01_MethodClassi.method1(str);
        P01_MethodClassi.method2(str);

        String kaydedilmisString = P01_MethodClassi.method2(str);

        System.out.println(kaydedilmisString.length());

        P02_TamSayiBolenler.tamSayiBolenleri(7);

    }
}
