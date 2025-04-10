package abstraction;

abstract class Abst{
	abstract void one();
	
	void print() {
		System.out.println("Heyyy");
	}
}

class Abd extends Abst{
	void one() {
		System.out.println("there");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abd a = new Abd();   // ✅ Create object
        a.one();             // ✅ Call non-static method
        a.print();           // ✅ You can also call inherited method
		
	}

}
