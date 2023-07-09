package StringManipulations;

import java.util.Locale;

public class P01 {

    public static void main(String[] args) {

        String str1 = "Canım nasıl isterse";

        System.out.println(str1.toUpperCase()); // CANIM NASIL İSTERSE
        System.out.println(str1.toLowerCase()); // canım nasıl isterse

        System.out.println(str1.toLowerCase(Locale.forLanguageTag("Tr")));


    }
}
