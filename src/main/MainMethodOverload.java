package main;

public class MainMethodOverload {
	// Standard main method used by JVM
    public static void main(String[] args) {
        System.out.println("Main with String[] args");
        
        // Calling the overloaded versions manually
        main(10);
        main("Java");
    }

    // Overloaded version 1
    public static void main(int num) {
        System.out.println("Overloaded main with int: " + num);
    }

    // Overloaded version 2
    public static void main(String str) {
        System.out.println("Overloaded main with String: " + str);
    }
}
