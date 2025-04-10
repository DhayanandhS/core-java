// Create a Car class with a constructor that takes brand and speed. 
// Print details using an object.

package practice;

class Car{
	Car(String brand, int speed){
		System.out.println(brand + " " + speed);
	}
}

public class Test1 {
	public static void main(String args[]) {
		Car c = new Car("Benz", 100);
	}

}
