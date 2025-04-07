package classes;

public class InstanceVariableNonStatic {
	
	// non static variable
	int a = 34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//for this variable we need to create an obj mandatory
		InstanceVariableNonStatic obj = new InstanceVariableNonStatic();
		System.out.println(obj.a);

	}

}
