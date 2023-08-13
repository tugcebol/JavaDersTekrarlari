package oop.constructor.soru_Car;

public class CarRunner {
    // Bir "Car" sınıfı oluşturun ve bu sınıfın bir oop.constructor'ı olsun.
    // Bu oop.constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.
    // Örnek çıktı:
    // Car objesi oluşturuldu: Ford Focus

    public static void main(String[] args) {

        Car car = new Car("Ford", "Focus");
        System.out.println(car); // Car objesi oluşturuldu: Ford Focus
    }
}
