package practiceQuestions.projectPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02 {

    //  Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
    //  Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
    //  Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
    //  Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
    //  hello ----> ıfmmp --->1 birim kaydırılmış hali

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şifrelemek istediğiniz metni girin: ");
        String sifre = scanner.nextLine();

        String[] arr;

        arr = sifre.split("");

        char krktr = 'a';

        for (int i = 0; i < arr.length; i++) {
            krktr = (char) (arr[i].charAt(0) + 1);
            System.out.print(krktr);
        }


    }
}
