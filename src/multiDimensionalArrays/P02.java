package multiDimensionalArrays;

import java.util.Arrays;

public class P02 {

    // Question 2: Add the elements with the same index in a given 2 dimensional array and assign these sums to a
    //             single layered array that we will create.
    //input :int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
    //output: [5, 7, 11]

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};

        int arrLength = 0;

        if (arr[0].length < arr[1].length) {
            arrLength = arr[0].length;
        }
        else {
            arrLength = arr[1].length;
        }

        int [] newArr = new int [arrLength];

        for (int i = 0; i < arrLength; i++) {

            newArr[i] = arr[0][i] + arr[1][i];
        }

        System.out.println(Arrays.toString(newArr));

    }


}

