package librarymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<books> book = new ArrayList<>();
    user u = new user("Dhanesh");
    int id = 0;
    Scanner sc = new Scanner(System.in);


    public void addbook() {
        System.out.println("Enter the name of the book:");
        String name = sc.next();
        System.out.println("Enter the name of the author:");
        String author = sc.next();
        books b = new books(id++, name, author);
        book.add(b);
        System.out.println("Book added successfully.");
    }


    public void editbook() {
        System.out.println("Enter the ID of the book to edit:");
        int bookId = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (books b : book) {
            if (b.id == bookId) {
                System.out.println("Enter new book name:");
                b.name = sc.nextLine();
                System.out.println("Enter new author name:");
                b.author = sc.nextLine();
                found = true;
                System.out.println("Book updated.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    public void deleteBook() {
        System.out.println("Enter the ID of the book to delete:");
        int bookId = sc.nextInt();
        boolean removed = false;

        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).id == bookId) {
                book.remove(i);
                removed = true;
                System.out.println("Book deleted.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Book not found.");
        }
    }


    public void displayBooks() {
        if (book.isEmpty()) {
            System.out.println("No books in the catalog.");
            return;
        }

        System.out.println("Book Catalog:");
        for (books b : book) {
            System.out.println("ID: " + b.id + ", Name: " + b.name + ", Author: " + b.author + ", Available: " + b.avl);
        }
    }


    public void borrowBook(user u) {
        System.out.println("Enter book ID to borrow:");
        int bookId = sc.nextInt();
        boolean found = false;

        for (books b : book) {
            if (b.id == bookId) {
                found = true;
                if (b.avl) {
                	u.booktaken(b);
                    b.avl = false;
                    System.out.println("Book borrowed successfully.");
                    break;
                } else {
                    System.out.println("Book is already borrowed.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    public void viewBorrowedBooks() {
        boolean hasBorrowed = false;
        System.out.println("Borrowed Books:");
        for (books b : book) {
            if (!b.avl) {
                hasBorrowed = true;
                System.out.println("ID: " + b.id + ", Name: " + b.name + ", Author: " + b.author);
            }
        }

        if (!hasBorrowed) {
            System.out.println("No books are currently borrowed.");
        }
    }
}
