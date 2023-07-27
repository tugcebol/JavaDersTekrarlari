package forEachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P05 {

    // Question 5: Write a code that compares the elements of the two given arrays
    // and returns the elements common to both of them as a separate list.

    public static void main(String[] args) {

        Integer arr1[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Integer arr2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> arrList = new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2:arr2
                 ) {
                if (each1 == each2 && !arrList.contains(each1)){
                    arrList.add(each1);
                }
            }
        }

        Collections.sort(arrList);
        System.out.println(arrList);
    }

}
