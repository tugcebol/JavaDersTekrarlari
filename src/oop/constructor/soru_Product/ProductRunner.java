package oop.constructor.soru_Product;

public class ProductRunner {

    // Bir "Product" sınıfı oluşturun ve bu sınıfın bir oop.constructor'ı olsun.
    // Bu oop.constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
    // Aynı zamanda, bu oop.constructor içinden "display" adında bir metodu çağırarak
    // ürün bilgilerini ekrana yazdırın.
    // Örnek çıktı:
    // Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet

    public static void main(String[] args) {
        Product product = new Product("Laptop", 4000.0,15);
        // Ürün adı: Laptop, Fiyat: 4000.0, Stok: 15 adet

    }
}
