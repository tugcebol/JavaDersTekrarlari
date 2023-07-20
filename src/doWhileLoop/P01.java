package doWhileLoop;

public class P01 {

    // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

    public static void main(String[] args) {

        char bas = 'k';
        char bit = 't';

        do {
            System.out.print(bas + " ");
            bas++;

        }while (bas<=bit);
    }
}
