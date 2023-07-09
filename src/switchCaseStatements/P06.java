package switchCaseStatements;

import java.util.Scanner;

public class P06 {

    // Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen gün numarasını girin: \n(Pazartesi için 1, Salı için 2...)");

        int gunNumarasi = scanner.nextInt();

        switch (gunNumarasi){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Geçersiz giriş!");

        }
    }
}
