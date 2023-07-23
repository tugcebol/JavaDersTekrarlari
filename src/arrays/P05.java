package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05 {

    // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
    //         donduren bir method olusturun.

    public static void main(String[] args) {

        intArrayOlustur();
    }

    public static int[] intArrayOlustur() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen oluşturmak istediğiniz int Array'in boyutunu yazın: ");
        int boyut = scanner.nextInt();

        int[] arr = new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.print("Lütfen Array'e eklemek istediğiniz int elementi girin: ");
            arr[i] = scanner.nextInt();

        }

        System.out.println("Oluşturulan Array: " + Arrays.toString(arr));
        return arr;
    }
}
