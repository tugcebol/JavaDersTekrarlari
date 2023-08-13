package oop.passByValue;

public class Q01 {

    // Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
    // geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello");
        System.out.println("Metnin ilk hali: " + text);
        modify(text);
        System.out.println("Metnin son hali: " + text);
    }

    private static void modify(StringBuilder str) {
        str.append(" Java");
        System.out.println("Method içindeki metin: " + str);

    }
}
