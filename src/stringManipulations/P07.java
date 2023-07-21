package stringManipulations;

public class P07 {

    // Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
    // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
    // input : java1 ogRe2@nMek3 #ne +Gu=zel
    // output : Java ogrenmek ne guzel

    public static void main(String[] args) {

        String input = "java1 ogRe2@nMek3 #ne +Gu=zel";

        input = input.replaceAll("\\d",""); // java ogRe@nMek #ne +Gu=zel

        input=input.replaceAll("\\s","1"); // java1ogRe@nMek1#ne1+Gu=zel

        input=input.replaceAll("\\W",""); // java1ogRenMek1ne1Guzel

        input = input.replaceAll("\\d", " "); // java ogRenMek ne Guzel

        input=input.toLowerCase(); // java ogrenmek ne guzel

        input=input.substring(0,1).toUpperCase() + input.substring(1); // Java ogrenmek ne guzel

        System.out.println(input);

    }
}
