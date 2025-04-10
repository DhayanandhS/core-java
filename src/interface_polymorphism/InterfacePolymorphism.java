package interface_polymorphism;

interface Animal{
	void sound(); // same as you define the abstract method
}
// if we define all of the interface methods itll show compile time error
class Dog implements Animal{
	public void sound() {
		System.out.println("Bark");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("Meow");
	}
}

public class InterfacePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a; // interface reference
		
		a = new Dog(); // Object of class implementing the interface
		a.sound(); // JVM chooses correct method at runtime
		
		a = new Cat();
		a.sound();
		
	}

}
