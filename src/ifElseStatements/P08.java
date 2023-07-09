package ifElseStatements;

import java.util.Scanner;

public class P08 {

    // Kullanicidan artik yil olup olmadigini kontrol
    //etmek icin yil girmesini isteyin.
    //Kural 1: 4 ile bolunemeyen yillar artik yil
    //degildir
    //Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    //Kural 3: 4’un kati olmasina ragmen 100 ile
    //bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yıl girin: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0 )
            if (yil % 100 == 0 )
                if (yil % 400 == 0 ) System.out.println("Artık yıl");
                else System.out.println("Artık yıl değil");
            else System.out.println("Artık yıl");
        else System.out.println("Artık yıl değil");

        // if (yil % 4 == 0 && yil % 100 != 0) System.out.println("Artık yıl");
        // else if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0 ) System.out.println("Artık yıl");
        // else if (yil % 4 != 0) System.out.println("Artık yıl değil");
        // else System.out.println("Artık yıl değil");


    }
}
