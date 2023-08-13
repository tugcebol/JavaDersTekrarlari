package constructor.soru_Product;

public class Product {
    String urunAdi = "";
    double fiyat;
    int stok;

    Product(String urunAdi, double fiyat, int stok){
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.stok = stok;
        display();
    }

    public void display(){
        System.out.println("Ürün adı: " + urunAdi + ", Fiyat: " + fiyat + ", Stok: " + stok + " adet");
    }
}
