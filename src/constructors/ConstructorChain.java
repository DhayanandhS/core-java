package constructors;

class A{
	A(){
		this("Hello"); //  here the constructor call must be in the start of method
		System.out.println("Hey");
	}
	
	A(String x){
		System.out.println(x);
	}
}

public class ConstructorChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();

	}

}
