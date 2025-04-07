package constructors;

class Stud{
	String n;
	int m;
	Stud(String name, int mark){
	    n = name;
		m = mark;
	}
	
	void display() {
		System.out.println(n + " " + m);
	}
}

public class UserDefinedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s = new Stud("Karthick", 100);
		s.display();
	}

}
