package inheritance;

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
	
	void desc(int count) { // method overload
		System.out.println(count);
	}
	
	void desc(int count, String name) { // method overload
		System.out.println(count + " " + name);
	}
}

class Dog extends Animal{
	@Override // method override
	void sound() {  /// This is the same method in animal class 
		System.out.println("Dog Barks");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.sound(); // calls the overriden method inside Dog class
		
		d.desc(5);
		d.desc(6,"Cheetah");
		
		// if we want sound() inside Animal class 
		// we need to create separate obj
		Animal a = new Animal();
		
		a.sound();

	}

}






