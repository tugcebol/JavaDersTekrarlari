package forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class P03 {

    // Question 3: Checking each element in a given String array,
    // - If the length of the word is an even number, return the first half
    // - If the length of the word is an odd number,
    // include the second half of the word, including the middle letter.
    // Add it to a new list and print it.

    public static void main(String[] args) {

        String[] arr = {"apple", "strawberry", "orange", "melon", "banana"};

        List<String> arrList = new ArrayList<>();

        for (String each : arr
        ) {
            if (each.length() % 2 == 0) {
                arrList.add(each.substring(0, (each.length() / 2)));
            } else {
                arrList.add(each.substring((each.length() / 2)));
            }
        }

        System.out.println(arrList);
    }
}