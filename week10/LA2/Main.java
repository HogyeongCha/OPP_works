package week10.LA2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        EmailValidator validator = new EmailValidator();
        boolean isValid = validator.isValidEmail(email);

        if (isValid) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        scanner.close();
    }
}
