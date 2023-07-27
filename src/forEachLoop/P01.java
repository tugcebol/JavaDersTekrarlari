package forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

    // Question 1: For the repeating elements in a given array,
    // delete the duplicates, make only one of all the
    // elements, assign the new version to the old array and print it.

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 1, 2, 2, 3, 4, 1, 2, 3, 2, 6, 7, 5, 6, 7, 9, 4, 3, 2, 6, 3, 9};

        List<Integer> arrList = new ArrayList<>();

        for (Integer each : arr
        ) {
            if (!arrList.contains(each)) {
                arrList.add(each);
            }
        }

        System.out.println(arrList); // [1, 2, 3, 4, 6, 7, 5, 9, 8]

        int sizeOfList = arrList.size();

        arr = new Integer[sizeOfList];

        int index = 0;
        for (Integer each : arrList
        ) {
            arr[index++] = each;
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 6, 7, 5, 9, 8]
    }
}
