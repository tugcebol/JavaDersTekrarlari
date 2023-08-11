package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeDersi03 {

    // Bir ArrayList oluşturun ve içine 5 adet renk ekleyin.
    // Daha sonra kullanıcıdan bir renk adı alın ve bu rengin ArrayList'te olup olmadığını ekrana yazdırın.

    public static void main(String[] args) {

        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("Yeşil");
        renkler.add("Pembe");
        renkler.add("Turuncu");
        renkler.add("Mor");
        renkler.add("Beyaz");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen aramak istediğiniz rengi girin: ");
        String arananRenk = scanner.nextLine();

        boolean renkVarMi = false;
        for (String renk:renkler) {
            if (renk.equalsIgnoreCase(arananRenk)){
                System.out.println("Aradığınız renk listede var.");
                renkVarMi = true;
                break;
            }
        }
        if (!renkVarMi){
            System.out.println("Aradığınız renk listede yok.");
        }

    }
}
