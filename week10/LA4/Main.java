package week10.LA4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        PasswordStrengthChecker checker = new PasswordStrengthChecker();

        System.out.println(checker.checkPasswordStrength(password));

        scanner.close();
    }
}
