package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class P04 {

    // Question 4: Take a given positive integer n, create a method that returns us the first n Fibonacci
    //             numbers as a list.

    public static void main(String[] args) {

        System.out.println(nthFibonacci(5));
    }

    public static List<Integer> nthFibonacci(int n) {

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);

        int fibonacciNumber = 0;
        int index = 3;

        while (fibonacciNumber < n) {

            fibonacciNumber = fibonacciList.get(index - 2) + fibonacciList.get(index - 1);

            if (fibonacciNumber < n) {
                fibonacciList.add(fibonacciNumber);
            }
            index++;
        }

        return fibonacciList;
    }
}
