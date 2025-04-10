package classes;

class Hello{
	static int b = 1;
	void show() {
		System.out.println(b);
	}
}

public class InstanceVariableStatic {
	
	// static variable
	static String a = "Hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// for static variable no obj creation needed
		System.out.println(InstanceVariableStatic.a);
		
		Hello h = new Hello();
		h.show();

	}

}
