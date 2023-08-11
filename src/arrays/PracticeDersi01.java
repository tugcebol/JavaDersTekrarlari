package arrays;

public class PracticeDersi01 {

    // Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
    // bir program yapmanız gerekmektedir. Her öğrenci için
    // iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
    // kullanmanız gerekmektedir.
    // Öğrencilere ait notları ve yıl ortalamasını hesaplayan Java programını yazınız:

    public static void main(String[] args) {

        // MultiDimensional Array : İç içe array
        // arr={{5. sınıf Öğrencileri},{6.sınıf Öğrencileri}}
        // arr={{{5A},{5B},{5C}}{{6A},{6B}}}
        // [][] : çoklu array tanımlamasıdır. her array için bir [] kullanılır.

        // Sınav notları için, her bir öğrenci için her bir dönem notunu ekleyeceğimiz
        // iç içe 2'li array oluşturalım.

        int[][] sinavNotlari = {
                {80, 100},   // 1. öğrencinin dönem notları
                {75, 90},    // 2. öğrencinin dönem notları
                {100, 100},  // 3. öğrencinin dönem notları
                {60, 60},    // 4. öğrencinin dönem notları
                {30, 90}     // 5. öğrencinin dönem notları
        };
        int toplam = 0;
        for (int i = 0; i < sinavNotlari.length; i++) {
            int ilkDonemNotu = sinavNotlari[i][0];
            int ikinciDonemNotu = sinavNotlari[i][1];
            System.out.println((i + 1) + ". öğrencinin notları: ");
            System.out.print("Birinci dönem notu: " + ilkDonemNotu + " ");
            System.out.print("İkinci dönem notu: " + ikinciDonemNotu + " ");

            // yılsonu notunu hesaplamak için iki notun ortalaması alınır
            double yilSonuNotu = (ikinciDonemNotu + ilkDonemNotu) / 2.0;
            System.out.println("\nYıl sonu not ortalaması: " + yilSonuNotu);
            System.out.println("---------------------------------------------");
        }
    }
}
