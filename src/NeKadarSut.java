import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NeKadarSut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> biberon = new ArrayList<>();
        boolean bittiMi = false;
        int i = 1;
        System.out.println("Lütfen yaptığınız mama miktarını ml cinsinden girin" +
                "\nBitirmek için '0'a basın...");
        while (!bittiMi) {
            System.out.print(i + ": ");
            int girilenMamaMiktari = scanner.nextInt();
            if (girilenMamaMiktari == 0) {
                bittiMi = false;
                break;
            } else {
                biberon.add(girilenMamaMiktari);
                i++;
            }
        }
        sutleriTopla(biberon);
    }

    public static void sutleriTopla(List<Integer>biberon) {

        int toplamMiktar = 0;
        int ogunSayisi = 0;
        for (Integer eachMama:biberon) {
            toplamMiktar += eachMama;
            ogunSayisi++;
        }

        System.out.println("Arden'in bugün içtiği süt miktarı: " + toplamMiktar + " ml"
                + "\nÖğün sayısı: " + ogunSayisi);

    }
}
