package forEachLoop;

public class P02 {

    // Question 2: Create a method that takes the squares of each element in the given int array
    // and prints the sum of its squares.

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 10};
        sumOfSquares(arr);
    }

    public static void sumOfSquares(int[]arr){

        int sum = 0;
        for (int each: arr
             ) {
            each *= each;
            sum += each;
        }

        System.out.println("Sum of each element's squares is: " + sum);
    }
}
