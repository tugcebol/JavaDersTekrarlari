package arrays;

import java.util.Scanner;

public class P05 {

    // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
    //         donduren bir method olusturun.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz Array'in boyutunu yazın: ");
        int boyut = scanner.nextInt();

    }

    public static int[] arrayOlustur (int boyut, int eleman){

        int [] arr = new int[boyut];

        while (arr[boyut] == arr.length){
            System.out.println("Lütfen eleman ");
        }

        return arr;
    }
}
