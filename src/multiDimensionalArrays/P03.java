package multiDimensionalArrays;

import java.util.Arrays;

public class P03 {

    // In a given 2 dimensional array, add the elements in each inner array and assign these sums to a
    // single layer array that we will create.
    // input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
    // output: [10, 3, 12, 10, 9]

    public static void main(String[] args) {

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        int sum = 0;

        int [] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum += arr[i][j];
            }
            newArr[i] = sum;
            sum = 0;
        }

        System.out.println(Arrays.toString(newArr));
    }


}
