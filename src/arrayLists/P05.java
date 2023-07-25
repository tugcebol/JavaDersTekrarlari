package arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05 {

    // Question 5: Create a method that takes a positive integer from the user and
    //             returns the smaller Fibonacci numbers to us as a list.

    public static void main(String[] args) {

        getSmallerFibonacciNumbers();
    }

    public static List<Integer> getSmallerFibonacciNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to find smaller Fibonacci numbers than the entered number: ");
        int number = scanner.nextInt();

        List<Integer> fibonacciList = new ArrayList<>();

        int a = 0;
        int b = 1;

        while (a <= number) {
            fibonacciList.add(a);
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(fibonacciList);

        return fibonacciList;
    }

}
