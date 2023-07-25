package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class P06 {


    // Question 6: Create a method that takes a positive integer from the user and returns all positive
    //             integers that can divide that integer to us as a list.

    public static void main(String[] args) {

        System.out.println(positiveIntDivisor(20));
    }

    public static List<Integer> positiveIntDivisor(int number) {

        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <=number ; i++) {

            if (number % i == 0){
                divisorList.add(i);
            }
        }

        return divisorList;
    }
}
