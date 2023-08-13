package oop.constructor.soru_Car;

public class Car {
    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";

    Car(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    public String toString() {
        return "Car objesi oluşturuldu: " +
                marka + " " + model
                ;
    }
}
