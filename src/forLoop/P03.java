package forLoop;

public class P03 {

    // Verilen iki sayının arasındaki tüm tamsayıları toplayıp yazdırın.
    // (iki sayıdan hangisinin küçük olduğu bilinmiyor)

    public static void main(String[] args) {

        int sayi1 = 100;
        int sayi2 = 20;
        int toplam = 0;

        if (sayi1<sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
                System.out.print(i + " ");
            }

        } else {
            for (int i = sayi1; i >= sayi2; i--) {
                toplam += i;
                System.out.print(i + " ");
            }

        }

        System.out.println("\nToplam: " + toplam);
    }
}
