package polymorphism;

class MyMath{
    //add(int,int)
    int add(int a,int b){
        return a+b;
    }
    //add(int,int,int)
    int add(int a,int b,int c){
        return a+b+c;
    }
    //add(int,float)
    float add(int a,float b){
        return a+b;
    }
    //add(float,float)
    float add(float a,float b){
        return a+b;
    }
    //add(float,int)
    float add(float a,int b){
        return a+b;
    }
}
public class Overloading {
 public static void main(String[] args) {
    MyMath mm=new MyMath();
    System.out.println(mm.add(10,20,30));   
    System.out.println(mm.add(10,20.00f));   
    System.out.println(mm.add(10.00f,20));   
    System.out.println(mm.add(10,20));   
    System.out.println(mm.add(10.00f,20.00f));   
 }   
}

