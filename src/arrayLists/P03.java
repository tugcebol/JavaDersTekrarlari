package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class P03 {

    // Question 3: Create a method that deletes the elements containing unwanted letters in a given String
    //             list and returns the remaining part to us as a list.

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list = P02.makeAList();

        String unwantedLetter = "A";
        System.out.println(deleteUnwantedElements(list, unwantedLetter));

    }

    public static List<String> deleteUnwantedElements(List<String> stringList, String unwantedLetter) {

        List<String> remainingList = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            if (!(stringList.get(i).toLowerCase().contains(unwantedLetter.toLowerCase()))) {
                remainingList.add(stringList.get(i));
            }
        }
        return remainingList;
    }
}
