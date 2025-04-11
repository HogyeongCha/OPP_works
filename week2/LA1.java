package week2;

import java.util.Scanner;

public class LA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put in the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Put in the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum:" + sum);
    }
}