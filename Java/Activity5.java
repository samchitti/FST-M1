package activity5;

//Abstract class has title of type String
abstract class Book {
	String title;

	// Abstract method that takes one String argument
	abstract void setTitle(String title);

	// Concrete method that returns the value of title.
	String getTitle() {
		return title;
	}
}
//Create another class that extends the abstract class called MyBook.
class MyBook extends Book {
	// Define abstract method
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Activity5 {
	public static void main(String[] args) {
		// Initialize title of the book
		String title = "The Unbearable Lightness of Being";
		// Create object for MyBook
		Book newNovel = new MyBook(); //creating an object
		// Set title
		newNovel.setTitle(title);
		// Print result
		System.out.println("The title is: " + newNovel.getTitle());
	}
}