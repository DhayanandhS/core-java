package abstraction;

abstract class Animal1 {
    abstract void sound();
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal1 a = new Dog1();  // ✅ Parent reference, child object
        a.sound();             // 🧠 JVM chooses Dog's sound() at runtime
    }
}