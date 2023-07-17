package whileLoop;

public class P01 {

    // Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
    // yazdirin.

    public static void main(String[] args) {

        int sayi = 10;

        while (sayi >= 10 && sayi <= 99) {
            if (sayi % 7 == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }

    }
}
