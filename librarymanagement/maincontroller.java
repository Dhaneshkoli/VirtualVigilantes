package librarymanagement;

import java.util.Scanner;

public class maincontroller {

	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int choice;
		user u = new user("Dhanesh");

		do {
			System.out.println("Library Menu");
			System.out.println("1. Add Book");
			System.out.println("2. Edit Book");
			System.out.println("3. Delete Book");
			System.out.println("4. Display All Books");
			System.out.println("5. Borrow Book");
			System.out.println("6. View Borrowed Books");
			System.out.println("7. Viewhistory");
			System.out.println("8. Exit");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				lib.addbook();
				break;
			case 2:
				lib.editbook();
				break;
			case 3:
				lib.deleteBook();
				break;
			case 4:
				lib.displayBooks();
				break;
			case 5:
				lib.borrowBook(u);
				break;
			case 6:
				lib.viewBorrowedBooks();
				break;

			case 7:
				u.viewHistory();
				break;
				
			case 8:
				System.out.println("Exiting... Thank you!");
				break;
				
			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 7);
	}
}
