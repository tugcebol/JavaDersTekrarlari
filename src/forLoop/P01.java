package forLoop;

public class P01 {

    // 3 basamaklı çift sayıların toplamını bul

    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 100; i <= 999; i++) {

            if (i % 2 == 0) {

                toplam += i;
            }
        }

        System.out.println(toplam);


    }
}
