package forLoop;

import java.util.Scanner;

public class P10 {

    // Soru 3: Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //         dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //         baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş olmak üzere iki adet pozitif tamsayı girin: ");
        System.out.print("Başlangıç sayısı: ");
        int bas = scanner.nextInt();
        System.out.print("Bitiş sayısı: ");
        int bit = scanner.nextInt();

        if (bit<bas){
            System.out.println("Bitiş değeri başlangıç değerinden küçük olamaz!");
        } else {
            int toplam = 0;
            for (int i = bas; i <= bit ; i++) {
                toplam += i;
            }
            System.out.println(bas + " ve " + bit + " arasında kalan sayıların toplamı: " + toplam);
        }
    }
}
