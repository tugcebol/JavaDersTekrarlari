package oop.constructor.soru_coordinates;

public class ConstructorCall01 {

    int x;
    int y;

    ConstructorCall01(int x, int y){
        this.x = x;
        this.y = y;
        display();
    }

    public void display(){
        System.out.println("X axis: " + x + ", " + "Y axis: " + y);
    }
}
