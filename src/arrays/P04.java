package arrays;

public class P04 {

    // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini,
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {

        String[] arr = {"elma", "armut", "arı", "elma", "alma", "ELMA", "elMA", "eLmA", "şeker", "kaymak"};
        String arananEleman = "elma";

        elemanVarMi(arr, arananEleman);

    }

    public static void elemanVarMi(String[] arr, String str) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (str.equalsIgnoreCase(arr[i])) {
                sayac++;
            }
        }

        if (sayac > 0) {
            System.out.println("Array'de aranan eleman " + sayac + " adet var.");
        } else {
            System.out.println("Array'de aranan eleman yok.");
        }
    }
}
