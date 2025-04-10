//Access Parent Class Variable

package inheritance;

class A1{
	int a = 5;
}

class B1 extends A1{
	void a() {
		int r = super.a; // first assigned
		System.out.println(r);
		System.out.println("B");
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b = new B1();
		
		b.a();
		
	}

}
