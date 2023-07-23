package arrays;

public class P06 {

    // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //         olusturun.

    public static void main(String[] args) {

        String [] arrMeyveler = {"Elma", "Armut", "Kayısı", "Karpuz", "Erik", "Şeftali", "Nar"};

        enKisaEnUzunKelime(arrMeyveler); // Arraydeki en kısa kelime: Nar
                                 // Arraydeki en uzun kelime: Şeftali
    }

    public static void enKisaEnUzunKelime(String[] arr) {

        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
            if (arr[i].length()> enUzunKelime.length()){
                enUzunKelime = arr[i];
            }
        }

        System.out.println("Arraydeki en kısa kelime: " + enKisaKelime +
                           "\nArraydeki en uzun kelime: " + enUzunKelime);
    }
}
