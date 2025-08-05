package gradetgracker;
import java.util.*;

public class Maincontroller {

	public static void main(String[] args) {
		System.out.println("Welcome! What do you want to do today?");
		student s = null;
		Scanner sc = new Scanner(System.in);

		try {
			int ch = 0;
			while (ch != 6) {
				System.out.println("\n1. Add student");
				System.out.println("2. Add course");
				System.out.println("3. Change grade");
				System.out.println("4. Display average grade");
				System.out.println("5. Display grades");
				System.out.println("6. Exit");

				ch = sc.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Enter the student ID:");
					int id = sc.nextInt();
					System.out.println("Enter the student name:");
					String name = sc.next();
					s = new student(id, name);
			 		System.out.println("Student created successfully.");
					break;

				case 2:
					if (s != null)
						s.addcourse();
					else
						System.out.println("Please add a student first.");
					break;

				case 3:
					if (s != null)
						s.changegrade();
					else
						System.out.println("Please add a student first.");
					break;

				case 4:
					if (s != null)
						s.displayaveragegrades();
					else
						System.out.println("Please add a student first.");
					break;

				case 5:
					if (s != null)
						s.displaygarde();
					else
						System.out.println("Please add a student first.");
					break;

				case 6:
					System.out.println("Thank you! Visit again.");
					break;

				default:
					System.out.println("Invalid choice. Try again.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
	