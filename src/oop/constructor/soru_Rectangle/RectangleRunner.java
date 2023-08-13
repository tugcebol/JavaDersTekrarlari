package oop.constructor.soru_Rectangle;

public class RectangleRunner {

    // Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki oop.constructor'ı olsun.
    // İlk oop.constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
    // İkinci oop.constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

    // Aynı zamanda, bu constructorlarin içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

    // Örnek çıktı:
    // Uzunluk: 8, Genişlik: 6
    // Kenar uzunluğu: 5 (Kare)

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(5,15);
        Rectangle rectangle3 = new Rectangle(6);
        Rectangle rectangle4 = new Rectangle(10);
        Rectangle rectangle5 = new Rectangle(25,100);
    }
}
