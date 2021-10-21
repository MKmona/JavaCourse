package chapter10;

public class Zoo {
    public static void main(String args[]){

        Dog rocky = new Dog(); // a normal Dog object
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //Polymorphism
        Animal sasha = new Dog();//sasha is of type Animal but an instance of Dog.
        sasha.makeSound(); //The override method in Dog class will be executed
        feed(sasha);

        //change Sasha from an instance of Dog to an instance of Cat.
        sasha = new Cat(); // this is legal because they are both of type Animal
        sasha.makeSound();
        ((Cat) sasha).scratch(); //Casting sasha to type Cat
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("Here's your cat food");
        }

    }
}
