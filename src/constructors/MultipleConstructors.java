// constructor overloading
package constructors;

class Book {
	int pages;
	String book_name;
	
	// the whole point of constructor overloading — 
	// you can choose which constructor to use depending on the arguments you pass.
	Book(){
		pages = 25;
		book_name = "Maari";
	}
	
	Book(int p, String bn){
		pages = p;
		book_name = bn;
	}
	
	public void show() {
		System.out.println(pages + " " + book_name);
	}
	
}

public class MultipleConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book(9,"men");
		book1.show();
		// book.Book(8,"Welcome"); -- this wont work
		
		Book book2 = new Book();
		book2.show();

	}

}
