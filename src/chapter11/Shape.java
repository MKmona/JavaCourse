package chapter11;

public abstract class Shape {
    //declaration of abstract method
     abstract double calculateArea(); // if the method is abstract then the class must be abstract.

    public void print(){
        System.out.println("I am a shape.");
    }
}
