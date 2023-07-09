package ifElseStatements;

import java.util.Scanner;

public class P10 {

    // Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
    // “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
    // gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir gun ismi girin: ");
        String gun = scanner.nextLine().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            int kalanGun = 6 - getGunIndex(gun);
            System.out.println("Simdi calisma zamani. Tatil için " + kalanGun + " gun var.");
        } else if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Simdi dinlenme zamani.");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }
    }

    private static int getGunIndex(String gun) {
        switch (gun) {
            case "pazartesi":
                return 0;
            case "salı":
                return 1;
            case "çarşamba":
                return 2;
            case "perşembe":
                return 3;
            case "cuma":
                return 4;
            default:
                return -1;
        }
    }
}


