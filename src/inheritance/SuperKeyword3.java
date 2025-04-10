// Call Parent Class Constructor

package inheritance;

class A2 {
    A2() {
        System.out.println("Constructor A");
    }
}

class B2 extends A2 {
    B2() {
        super(); // Optional - compiler adds it by default
        System.out.println("Constructor B");
    }
}

public class SuperKeyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B2 b = new B2();
		
	}

}
