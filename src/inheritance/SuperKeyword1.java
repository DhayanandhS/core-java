// Call Parent Class Method

package inheritance;

class A{
	void a() {
		System.out.println("A");
	}
}

class B extends A{
	void a() {
		super.a();
		System.out.println("B");
	}
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		
		b.a();
		
	}

}
