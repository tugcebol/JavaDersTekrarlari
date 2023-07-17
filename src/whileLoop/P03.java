package whileLoop;

public class P03 {

    // Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
    // donduren bir method olusturun.

    public static String metniTersCevir(String metin) {

        String tersMetin = "";
        int index = metin.length() - 1;

        while (index >= 0) {

            tersMetin += metin.charAt(index);
            index--;
        }

        return tersMetin;
    }

    public static void main(String[] args) {

        System.out.println(metniTersCevir("Java"));
    }
}
