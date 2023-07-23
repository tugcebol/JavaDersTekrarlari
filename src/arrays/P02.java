package arrays;

public class P02 {

    //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //        method yaziniz.

    public static void main(String[] args) {

        int[] arr = {3, 4, -2, 0, 2, -3, -9, 3, 6, -11};

        System.out.println(pozitifTamsayiTopla(arr));
    }

    public static int pozitifTamsayiTopla(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }

        return toplam;
    }

}
