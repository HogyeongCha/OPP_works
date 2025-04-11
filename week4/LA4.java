package week4;

import java.util.Scanner;

public class LA4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean running = true;

        while (running) {
            intro();
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(balance, depositAmount);
                System.out.print("Deposited " + depositAmount + " WON. Current balance: " + balance + " WON");
            } else if (choice == 2) {
                System.out.print("Enter withdrawal: ");
                int withdrawAmount = scanner.nextInt();
                int newBalance = withdraw(balance, withdrawAmount);
                if (newBalance != balance) {
                    balance = newBalance;
                    System.out.print("Withdrawn " + withdrawAmount + " WON. Current balance: " + balance + " WON");
                }
            } else if (choice == 3) {
                System.out.print("Current balance: " + balance + " WON");
            } else if (choice == 4) {
                System.out.print("Exit the system.");
                running = false;
            } else {
                System.out.print("Invalid choice. Please select again.");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int deposit(int balance, int amount) {
        return balance + amount;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            System.out.print("Tried to withdraw " + amount + " WON, but the balance is insufficient.");
            return balance;
        }
    }

    public static void line() {
        for (int i = 0; i < 55; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void intro() {
        line();
        System.out.println("1. Deposit | 2. Withdraw | 3. Check Balance | 4. Exit");
        line();
    }
}
