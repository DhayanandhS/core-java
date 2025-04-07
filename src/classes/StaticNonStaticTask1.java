package classes;

public class StaticNonStaticTask1 {
	
	static String company = "Tech Corp";
	
	int name = 5;
	
	static void showCompany() {
		System.out.println("Show company");
		System.out.println(company);
	}
	
	void show() {
		System.out.println("Only Show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNonStaticTask1 s = new StaticNonStaticTask1();
		
		
		// it is not mandatory to make an obj for the static variable inside main class
		System.out.println(StaticNonStaticTask1.company);
		
		// but it is madatory for non static obj
		System.out.println(s.name);
		
		// calling static method
		s.showCompany();
		
		// calling non static method
		s.show();
	}

}
