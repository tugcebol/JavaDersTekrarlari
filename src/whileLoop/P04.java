package whileLoop;

import java.util.Scanner;

public class P04 {

    // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
    // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
    // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
    // bunlarin toplaminin kac oldugunu yazdirin
    // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
    // negatif sayiyi sayi adedine ve toplama eklemeyin

    public static void main(String[] args) {

        Scanner scanner;

        int sayi = 1;
        int toplam = 0;
        int sayac = 0;

        while (sayi!=0) {

            System.out.println("Lütfen toplamak için pozitif tam sayılar girin: " +
                    "\nBitirmek için '0' a basın.");

            scanner = new Scanner(System.in);
            sayi = scanner.nextInt();

            if (sayi < 0) {
                System.out.println("Girilen sayı negatif olamaz!");
                continue; // kod bir şey yapmaz, ancak loop devam eder ---> break; ten farkı bu
            }

            toplam+=sayi;
            sayac++;

            if (sayi ==0){

                System.out.println(sayac + " adet girilen pozitif tam sayının toplamı: " + toplam);
                break;
            }
        }




    }
}
