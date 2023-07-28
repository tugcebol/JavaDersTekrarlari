package practiceQuestions.projectPractice;

import java.util.ArrayList;
import java.util.List;

public class Q01 {

    // Create a method that turns a given decimal value to a binary value.
    // Example: 12 = 1 1 0 0

    public static void main(String[] args) {

        getBinary(12);
    }

    public static void getBinary(int givenNumber) {

        int remainder = 0;
        int number = givenNumber;

        List<Integer> list = new ArrayList<>();

        do {
            remainder = number % 2;
            list.add(remainder);
            number = number/2;
        } while (number >= 1);

        System.out.print(givenNumber + " = ");

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }


    }
}
