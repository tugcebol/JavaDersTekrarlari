package forEachLoop;

import java.util.ArrayList;

public class PracticeDersi01 {

    // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
    // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın. (forEachLoop kullanın)
    // Örnek çıktı:
    // Meyveler: ELMA ARMUT ÇİLEK

    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("çilek");

        for (String each:meyveler
        ) {
            System.out.print(each.toUpperCase() + " ");
        }

    }
}
