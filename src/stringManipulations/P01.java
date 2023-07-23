package stringManipulations;

import java.util.Locale;

public class P01 {

    public static void main(String[] args) {

        String str1 = "Java Candır";

        System.out.println(str1.toUpperCase()); // JAVA CANDIR
        System.out.println(str1.toLowerCase()); // java candır
        System.out.println(str1);               // Java Candır

        System.out.println(str1.toLowerCase(Locale.forLanguageTag("Tr")));


    }
}
