package abstraction;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Polymorphism in action!
        myDog.makeSound();         // Dog barks
        myDog.eat();               // Animal eats food.
    }
}
