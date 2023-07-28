package practiceQuestions.projectPractice;


import java.util.Arrays;

public class Q03 {

    //  MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
    //  Mountain array ==> [0,2,5,3,1]
    //  Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
    //  Mountain array değildir ==>[5,2,7,1,4]

    public static void main(String[] args) {

        int[] arr1 = {0, 2, 5, 3, 1};
        int[] arr2 = {5, 2, 7, 1, 4};

        mountainArrayMi(arr1); // Mountain Array ==> [0, 2, 5, 3, 1]
        mountainArrayMi(arr2); // Mountain Array Değil ==> [5, 2, 7, 1, 4]
    }

    public static void mountainArrayMi(int[] arr) {
        int indexOfMid = (arr.length - 1) / 2;

        int flag = 0;
        int sayac = 0;

        for (int i = 0; i < indexOfMid; i++) {
            if (arr[i] < arr[i + 1]) {
                flag++;
            }
            sayac++;
        }

        for (int i = arr.length - 1; i > indexOfMid; i--) {
            if (arr[i] < arr[i - 1]) {
                flag++;
            }
            sayac++;
        }

        if (flag == sayac) {
            System.out.println("Mountain Array ==> " + Arrays.toString(arr));
        } else {
            System.out.println("Mountain Array Değil ==> " + Arrays.toString(arr));
        }
    }

}
