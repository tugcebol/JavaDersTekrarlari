package multiDimensionalArrays;

import java.util.Arrays;

public class P05 {

    // Question 5: Create a method that prints the sum of the last elements of each inner array in a given 2
    //             dimensional array.

    public static void main(String[] args) {

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        sumOfLastElements(arr);

    }

    public static void sumOfLastElements(int[][] arr) {

        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
               sum += arr[i][((arr[i].length)-1)];
        }

        System.out.println("Sum of the last elements from inner arrays: " + sum);

    }


}
