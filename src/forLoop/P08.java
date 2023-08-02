package forLoop;

public class P08 {

    // Soru 1: Çarpım tablosunu ekrana yazdıran bir program yazın
    //         (örneğin 1x1'den 10x10'a kadar).

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "'ler basamağı");
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("");
        }
    }
}
