package multiDimensionalArrays;

public class P01 {

    // Question 1: Create a method that adds the even numbers in a given 2 dimensional array and prints the result.

    public static void main(String[] args) {

        int [] arr = {4, 7, 3, 11, 2, 5, 21, 8, 10, 0};
        addEvenNumbers(arr);
    }

    public static void addEvenNumbers (int [] arr){

        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        System.out.println("The result after adding even numbers: " + sum);
    }
}
