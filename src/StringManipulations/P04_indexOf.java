package StringManipulations;

public class P04_indexOf {

    // Verilen metnin, String içerisinde 2 kere olup olmadığını bulun

    public static void main(String[] args) {

        String str = "Sıcak sıcak çorba, yemyeşil roka ve çorba";
        String metin = "helva";

        int index1 = str.indexOf(metin);
        int index2 = str.indexOf(metin,index1+1);

        if (index1 == -1) {
            System.out.println("String metin içermiyor");
        }
        else {
            if (index2 == -1){
                System.out.println("Metin String'in içinde 1 tane var");
            }
            else {
                System.out.println("Metin String'in içinde 2 tane var");
            }
        }




    }
}
