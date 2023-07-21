package methodOlusturma;

import java.util.Scanner;

public class P02_TamSayiBolenler {

    // Kullanıcıdan main method içinde bir tamsayı alin.
    // Girilen sayının pozitif tam bölen sayılarını bulup
    // bize döndüren bir method oluşturun.
    //  input : 20  output: pozitif tam bolenleri : 1,2,4,5,10,20  bölen sayısı : 6

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        tamSayiBolenleri(sayi);

    }

    public static int tamSayiBolenleri(int sayi) {

        int tamSayiBolenler = 0;

        System.out.print("Pozitif tam bölenleri: ");

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamSayiBolenler++;
                if (tamSayiBolenler > 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }

        System.out.println(" Bölen sayısı: " + tamSayiBolenler);
        return tamSayiBolenler;
    }
}
