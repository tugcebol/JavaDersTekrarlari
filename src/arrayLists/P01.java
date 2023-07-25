package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class P01 {

    // Question 1: For the repeating elements in a given array, create a method that will delete the duplicates
    // and make only 1 of all elements and return them to us.

    public static void main(String[] args) {

        int[] arr = {2, 4, 0, 5, 3, 9, 2, 1, 0, 5, 3, 7, 1, 2, 0, 5, 8, 7, 8, 9, 2, 4};

        System.out.println(deleteDuplicates(arr));


    }

    public static List<Integer> deleteDuplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        return (ArrayList) list;
    }
}
