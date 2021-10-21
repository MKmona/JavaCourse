package chapter11;

public class ShapeTester {

    public static void main(String args[]){

        Shape rectangle = new Rectangle(5,7);
        rectangle.print(); // from the Shape class
        System.out.println(rectangle.calculateArea());

    }
}
