package polymorphism;

class Base extends Object{
    int a;
    Base(){
        super();
        a=10;
    }   
    Base(int a){
        super();
       this.a=a;
    }   
    //to display Base class object state
    public void display() //b1=1002  c1=2002
    {   
        System.out.println("a:\t"+a); //System.out.println("a:\t"+b1.a);
    }
}
class Child extends Base{
    int b;
    Child(){
        //super();
        b=20;
    }
    Child(int b){
        super(300);
        this.b=b;
    }

    @Override
    public void display(){
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
    }

}
class SubChild extends Child{
    int c;
    SubChild(){
        //super(); 
        c=30;
    }
    SubChild(int c){
        super(200);
        this.c=c;
    }
    @Override
    public void display(){
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
        System.out.println("c:\t"+c);
    }
}
public class MethodOverRide {
    public static void main(String[] args) {
        // SubChild r1=new SubChild(100);     
        // System.out.println("object state...");   
        // System.out.println("r1.a:\t"+r1.a);
        // System.out.println("r1.b:\t"+r1.b);
        // System.out.println("r1.c:\t"+r1.c);
        Base b1=new Base();    
        //b1=1002
        System.out.println("Base class object b1 state");
        b1.display();            

        System.out.println("Child class object c1 state");
        Child c1=new Child();
        //c1=2002
        c1.display(); //
        SubChild sc1=new SubChild();
        System.out.println("SubChild class object sc1 state");
        sc1.display();
    }
}

