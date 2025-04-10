package binding;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, child object
        a.sound();             // Dynamic Binding - Dog's sound() is called
    }
}

