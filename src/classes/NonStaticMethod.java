package classes;

//class Carr{
//	int a = 5;
//	
//	void print(int a) {
//		System.out.println(a);
//	}
//}

public class NonStaticMethod {
	
	int a = 5;
	void show() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethod c = new NonStaticMethod();
		c.show();
	}

}
