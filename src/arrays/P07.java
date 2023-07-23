package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07 {

    // Create a method that adds a given element in a given array and
    // returns it to user,
    // assign the new value to the old array.

    public static void main(String[] args) {

        String[] arrFruits = {"Apple", "Pear", "Watermelon", "Peach", "Cherry",};
        String fruit = "Strawberry";

        arrFruits = addFruitName(arrFruits, fruit);
        System.out.println(Arrays.toString(arrFruits));
    }

    public static String[] addFruitName(String[] arr, String str) {

        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = str;

        //arr = new String[arr.length + 1];

        return newArr;
    }

}
