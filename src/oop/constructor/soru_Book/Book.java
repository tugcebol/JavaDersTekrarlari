package oop.constructor.soru_Book;

public class Book {

    String kitapAdi = "Belirtilmemiş";
    String yazarAdi = "Belirtilmemiş";
    int yayinYili = 1900;

    Book(String kitapAdi,String yazarAdi, int yayinYili){

        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
    }
    public String toString() {
        return
                "\"" + kitapAdi +"\"" +
                        " - " + yazarAdi +
                        " (" + yayinYili + ")";
    }
}

