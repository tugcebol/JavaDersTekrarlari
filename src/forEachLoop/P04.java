package forEachLoop;

import java.util.Scanner;

public class P04 {

    // Question 4: Take a sentence and a letter from the user, print how many times the letter is used in the
    //             sentence, if not, print “the letter is not used in the sentence”.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sent = scanner.nextLine();

        System.out.print("Please enter a letter: ");
        String letter = scanner.next();

        sent = sent.replaceAll("\\s", "");

        String[] sentArr = sent.split("");

        int counter = 0;

        for (String each: sentArr
             ) {
            if (each.equals(letter)){
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("The letter " + letter + " is not used in the senetence!");
        }else {
            System.out.println("The letter " + letter + " used " + counter + " times in the sentence.");
        }

    }
}
