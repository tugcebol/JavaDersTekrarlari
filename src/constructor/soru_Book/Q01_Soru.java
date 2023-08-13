package constructor.soru_Book;

public class Q01_Soru {

    // Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
    // Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır
    // Örnek çıktı:
    // Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)

    public static void main(String[] args) {

        Book book = new Book("Java Programlama", "Ahmet Bulutluöz",2021);
        System.out.println(book);
    }

}
