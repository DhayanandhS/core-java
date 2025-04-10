package binding;

class Static {
    static void greet() {
        System.out.println("Hello from static method");
    }

    public static void main(String[] args) {
        Static.greet();  // Static Binding
    }
}


