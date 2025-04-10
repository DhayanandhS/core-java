package inheritance;

class Parent{
	void display() {
		System.out.println("Hello");
	}
}

class Child extends Parent{
	void show() {
		System.out.println("World");
	}
}

public class BasicInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.display(); // here because we have extended the
		// Parent class inside Child class we can access
		// the properties of both
		c.show();
		
		Parent p = new Parent();
		p.display();
		// p.show(); this is error

	}

}
