package multiDimensionalArrays;

public class P04 {

    // Question 4: Create a method that returns the product of all numbers in a given 2 dimensional array.

    public static void main(String[] args) {

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        System.out.println(productOfEachElement(arr));

    }

    public static int productOfEachElement(int[][] arr) {

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                product *= arr[i][j];
            }
        }
        return product;
    }
}
