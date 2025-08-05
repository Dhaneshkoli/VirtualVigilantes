package librarymanagement;

import java.util.ArrayList;

public class user {

	
	String name;
	ArrayList<books>book;
	
	public user(String name) {
		super();
		this.name = name;
		this.book = new ArrayList<>();
	}
	public void booktaken(books b){
		if (b.avl) {
			book.add(b);
			b.avl=false;
		}
		else {
			System.out.println("book already taken");
		}
	}
	
	public void viewHistory() {
	    System.out.println("Borrowing history for " + name + ":");
	    for (books b : book) {
	        System.out.println(b);
	    }
	

		
	}
}
