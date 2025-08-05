package atmsimulator;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    protected String accountholder;
    protected int pin;
    protected double balance;

    public Account(String accountholder, int pin, double balance) {
        this.accountholder = accountholder;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validate(int yourpin) {
        return this.pin == yourpin;
    }

    public void changepin(int yourpin) {
        if (this.pin == yourpin) {
            System.out.print("Enter your new PIN: ");
            int newpin = sc.nextInt();
            this.pin = newpin;
            System.out.println("PIN successfully changed.");
        } else {
            System.out.println("Incorrect current PIN.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        double d = sc.nextDouble();
        if (d > 0) {
            balance += d;
            System.out.println("Deposit successful. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (this.pin == enteredPin) {
            System.out.print("Enter the amount you want to withdraw: ");
            double w = sc.nextDouble();
            if (w <= balance && w > 0) {
                balance -= w;
                System.out.println("Withdrawal successful. New balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    public void getBalance() {
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if (this.pin == enteredPin) {
            System.out.println("Your current balance is: ₹" + balance);
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}
