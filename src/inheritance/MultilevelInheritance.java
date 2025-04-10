package inheritance;

class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }

    void info(String name) {
        System.out.println("Animal name: " + name);
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void breed() {
        System.out.println("Dog breed: Labrador");
    }
}

class Puppy extends Dog1 {
    @Override
    void sound() {
        System.out.println("Puppy yaps");
    }

    void age(int months) {
        System.out.println("Puppy age: " + months + " months");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // From Puppy class
        p.sound(); // Overridden 2 times: Puppy version
        p.age(5);

        // From Dog class
        p.breed();

        // From Animal class
        p.info("Bruno");
    }
}
