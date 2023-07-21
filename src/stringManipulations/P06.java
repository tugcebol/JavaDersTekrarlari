package stringManipulations;

import java.text.DecimalFormat;

public class P06 {

    // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
    // input1 : “15.30 €” , input2 : “11.40 €”
    // output : 26.70 €

    public static void main(String[] args) {

        String input1 = "15.30 €";
        String input2 = "11.40 €";


        input1 = input1.replace("€", "");
        input1 = input1.replace(" ","");

        input2 = input2.replace("€", "");
        input2 = input2.replace(" ","");

        double doubleInput1 = Double.parseDouble(input1);
        double doubleInput2 = Double.parseDouble(input2);


        double toplam;
        toplam = doubleInput1 + doubleInput2;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String stringToplam = decimalFormat.format(toplam);

        System.out.println("Girilen değerlerin toplamı: " + stringToplam + " €");





    }
}
