package constructor.soru_Rectangle;

public class Rectangle {
    int uzunluk;
    int genislik;
    int kenarUzunlugu;

    Rectangle(int uzunluk, int genislik){
        this.uzunluk = uzunluk;
        this.genislik = genislik;
        display(uzunluk,genislik);
    }
    Rectangle(int kenarUzunlugu){
        this.kenarUzunlugu = kenarUzunlugu;
        display(kenarUzunlugu);
    }
    public void display(int uzunluk, int genislik){
        System.out.println("Uzunluk: " + uzunluk + ", Genişlik: " + genislik);
    }
    public void display(int kenarUzunlugu){
        System.out.println("Kenar uzunluğu: " + kenarUzunlugu + " (Kare)");
    }
}
