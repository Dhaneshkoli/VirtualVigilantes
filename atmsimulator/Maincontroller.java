package atmsimulator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maincontroller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account("Dhanesh", 1234, 5000);

        int attempts = 0;
        boolean accessGranted = false;

       
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            if (ac.validate(pin)) {
                accessGranted = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");
            }
        }

        if (!accessGranted) {
            System.out.println("Too many failed attempts. Account locked. Exiting...");
            sc.close();
            return;
        }

        int ch = 0;
        while (ch != 5) {
            System.out.println("ATM MENU");
            System.out.println("1. Change PIN");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter your current PIN: ");
                        int currentPin = sc.nextInt();
                        ac.changepin(currentPin);
                        break;
                    case 2:
                        ac.withdraw();
                        break;
                    case 3:
                        ac.deposit();
                        break;
                    case 4:
                        ac.getBalance();
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose between 1-5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
