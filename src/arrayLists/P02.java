package arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02 {

    // Question 2: Create a method that will take as many names as you want from the user
    // and return the names entered as a list when you press Q.

    public static void main(String[] args) {

        System.out.println(makeAList());

    }

    public static List<String> makeAList() {

        Scanner scanner;
        String name;
        List<String> list = new ArrayList<>();

        do {
            scanner = new Scanner(System.in);
            System.out.println("Please enter a name: \n(Press 'Q' to exit)");
            name = scanner.nextLine();

            if (!name.equalsIgnoreCase("q")){
                list.add(name);
            }

        } while (!(name.equalsIgnoreCase("Q")));

        return list;
    }
}
