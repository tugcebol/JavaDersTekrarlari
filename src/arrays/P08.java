package arrays;

import java.util.Arrays;

public class P08 {

    // Without using ArrayList, get rid of the duplicate elements from a given Array,
    // and obtain a unique Array.

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 2, 4, 5, 7, 8, 0, 5, 4, 2, 1, 5, 6, 7, 9, 3, 5, 4, 5, 3, 5, 7, 6, 8, 9, 0, 6, 4, 3, 2};

        int counter = 0;
        int controlNumber = 1000;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=controlNumber){
                controlNumber = arr[i];
                counter++;
            }
        }
        int[]newArr = new int[counter];
        controlNumber = 1000;
        int a = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (controlNumber!=arr[i]){
                newArr[a] = arr[i];
                controlNumber = arr[i];
                a++;
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
