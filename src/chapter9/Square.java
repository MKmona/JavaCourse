package chapter9;

public class Square extends Rectangle{

    //Overriding the method of calculatePerimeter
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
    public void print(String what){
        System.out.println("I'm a " + what);
    }
}
