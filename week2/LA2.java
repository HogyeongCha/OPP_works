package week2;

import java.util.Scanner;

public class LA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;

        System.out.print("input: ");
        int num = scanner.nextInt();

        if (num == 0) {
            result = "zero and even";
        } else if (num % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.println("output: This number is " + result + ".");
    }
}