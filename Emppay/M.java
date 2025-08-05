package Emppay;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class M {
	static String FILE_NAME = "employees.txt";
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<employee> employees = new ArrayList<>();

        while (true) {
            System.out.println(" Employee Payroll System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Payroll");
            System.out.println("3. Save and Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Designation (Full-Time/Part-Time): ");
                    String des = sc.nextLine();

                    employee emp = null;
                    if (des.equalsIgnoreCase("Full-Time")) {
                        emp = new Fulltime(name, salary);
                    } else if (des.equalsIgnoreCase("Part-Time")) {
                        emp = new parttime(name, salary);
                    } else {
                        System.out.println("Invalid designation.");
                        break;
                    }
                    employees.add(emp);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.println("Payroll Report");
                    for (employee e : employees) {
                        System.out.printf( e.name, e.designation, e.calculatePay());
                    }
                    break;

                case 3:
                    saveToFile(employees);
                    System.out.println("Data saved. Exiting.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
       

	
	
	}

	private static void saveToFile(List<employee> employees) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        for (employee e : employees) {
            writer.write(e.toString());
            writer.newLine();
        }
        writer.close();
    
		
	}
}

