package ifElseStatements;

import java.util.Scanner;

public class P01 {

    // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
    //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu girin: ");
        double knr1 = scanner.nextDouble();
        double knr2 = scanner.nextDouble();
        double knr3 = scanner.nextDouble();

        if (knr1==knr2 && knr2==knr3 && knr1>0) System.out.println("Eşkenar üçgen");
        else System.out.println("Eşkenar değil");



    }
}
