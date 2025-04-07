package constructors;

class Dem{
	int x;
	
	Dem() { // this is a constructor (user defined one too)
		// x=5; if we give the x value here its user defined
	}
	
	void Dem() { // this is a normal non static method 
		int x = 5;
		System.out.println(x);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem d = new Dem();
		System.out.println(d.x);
		d.Dem();

	}

}
