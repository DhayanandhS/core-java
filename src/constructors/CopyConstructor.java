package constructors;

class Copy{
	int a;
	// this is copy constructor
	
	Copy(){
		a = 1;
		System.out.println(a+1);
	}
	
	Copy(Copy obj){
		a = obj.a;  // this line will take the current value of "a" that is 2.
		System.out.println(a+5);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Copy c1 = new Copy();
		Copy c2 = new Copy(c1);

	}

}
