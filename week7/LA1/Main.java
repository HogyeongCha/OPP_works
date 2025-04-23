package week7.LA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            Person person = new Person(name, age);
            AgeValidator.validate(person);

            System.out.println("User info is valid. Input successful!");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Program ended.");
        }

        scanner.close();
    }
}