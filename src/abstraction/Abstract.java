package abstraction;

abstract class Abst{
	abstract void one(); // no body allowed
	
	void print() {
		System.out.println("Heyyy");
	}
}

class Abd extends Abst{
	void one() {
		System.out.println("there");
	}
}

class Ab extends Abd{
	void one() {
		System.out.println("HRU??");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Abst ab = new Abst(); // we cant create obj for abstract class
		
		Abd a = new Abd();   // ✅ Create object
        a.one();             // ✅ Call non-static method
        a.print();           // ✅ You can also call inherited method
        
        Abst b =new Ab();
        b.one();
		
	}

}
