package oop.constructor.soru_Book;

public class BookRunner {

    // Bir "Book" sınıfı oluşturun ve bu sınıfın bir oop.constructor'ı olsun.
    // Bu oop.constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır
    // Örnek çıktı:
    // Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)

    public static void main(String[] args) {

        Book book = new Book("Java Programlama", "Ahmet Bulutluöz",2021);
        System.out.println(book);
    }

}
