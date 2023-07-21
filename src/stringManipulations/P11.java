package stringManipulations;

import java.util.Scanner;

public class P11 {

    // Kullanıcıdan alınan String'i ters yazdırın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir kelime veya cümle girin: ");
        String input = scanner.nextLine();

        String tersInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            tersInput += input.charAt(i);
        }

        System.out.println(tersInput);


    }

}
