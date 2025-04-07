package classes;

class Car{
	String brand;
	int speed;
	
//	public Car(String string, int i) {
//		// TODO Auto-generated constructor stub
//		System.out.println(brand + " " + speed);
//	}

	void Details() {
		System.out.println(brand + " " + speed);
	}
}

public class Test1 {
	public static void main(String args[]) {
		Car mycar = new Car();
		
		mycar.brand = "Volvo";
		mycar.speed = 300;
		
		mycar.Details();
	}
}
