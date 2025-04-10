package constructors;

class Car{
	private Car() {
		System.out.println("Car");
	}
	
	// Factory method
    public static Car getInstance() {
        return new Car();  // allowed because it's inside the same class
    }
}

public class ConstructorModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = Car.getInstance();
	}

}
