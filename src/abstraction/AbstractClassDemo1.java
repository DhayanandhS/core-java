package abstraction;

import java.util.Scanner;
import static java.lang.System.*;
abstract class Animal{
    abstract void makeSound();  //non-implemented or abstract method and it is package private
    void sleep()  //package private
    {
        System.out.println("sleeping....");
    }
    
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bow...Bow...Bow...Bow...");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
class Goat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bleat! (Baa!)");
    }
}

class PetStation{
    static Animal getPet(String animalType){
        Animal pet=null;
        if(animalType.equals("dog")){
            pet=new Dog();
        }else if(animalType.equals("cat")){
            pet=new Cat();
        }else if(animalType.equals("goat")){
            pet=new Goat();
        }
        return pet;
    }
}

public class AbstractClassDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(in);  
        System.out.println("Pet Animals list!");
        System.out.println("DOG");
        System.out.println("CAT");
        System.out.println("GOAT");
        System.out.println("Which animal you want?");
        String animalType=scan.next();

        Animal pet=PetStation.getPet(animalType);
        pet.makeSound();
        pet.sleep();
    }    
}

