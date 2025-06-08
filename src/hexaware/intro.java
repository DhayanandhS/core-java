package hexaware;

//if a block is defined by using a keyword called class, then it is called as class
//it contains fields/data and methods.
class Emp{
    //static variable
    static String company="Hexaware";
    static{
        System.out.println("static block..");
    }
    //instance variables
    int eno;
    String ename;
    float sal;

    //non-static block (or) instance block
    {
        System.out.println("instance block");
    }

    Emp(){
      //super();
      //eno=0;
      //ename=null;
      //sal=0.0f;
      //System.out.println("instance block");
    }
    //instance method
    void display()  //e2=6002
    {   System.out.println("Object state...........");
        System.out.println("eno:\t"+eno);  //System.out.println("eno:\t"+5002.eno);
        System.out.println("ename:\t"+ename); //System.out.println("ename:\t"+5002.ename);
        System.out.println("sal:\t"+sal); ////System.out.println("sal:\t"+5002.sal);
    }
    //instance method  (mutator method)
    void setEno(int eno)  //e1
    {   this.eno=eno;  //this.eno=eno; e1.eno=eno;
    }
    void setEname(String ename)  //e1
    {   this.ename=ename;  //this.ename=ename; e1.ename=ename;
    }
    void setSal(float sal)  //e1
    {   this.sal=sal;  //this.sal=sal; e1.sal=sal;
    }
}
class First{
    public static void main(String[] args) {  // args is a command line argument
        new Emp(); // this creates an object too
        Emp e1=new Emp();   //e1 contains object address
        //new is a memory allocation operator
        //Emp(): non-parameterized constructor calling statement 
        //Note: e1 and args are local variables
        //Note: e1 is also reference variable
        Emp e2=new Emp();   //e2 contains object address
        //new operator tells the JVM to allocate memory for instance variables of a class.
        e1.setEno(101);
        e1.setEname("Anish");
        e1.setSal(100000.00f);
        e1.display();   //method calling by using object

        e2.setEno(102);
        e2.setEname("Mary");
        e2.setSal(200000.00f);
        e2.display();
        // Emp e3=null;     //e3 doesn't contains contain object address, so we can't say it is an object
        // e3.display();    //you are calling instance method by using null reference
    }
}

