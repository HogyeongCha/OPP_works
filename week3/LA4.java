package week3;

import java.util.Scanner;

public class LA4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many layers do you want your pyramid to be?");
        int num = scanner.nextInt();

        System.out.println("\nThe pyramid below shows the " + num + " layers");
        for (int i = 0; i < num; i++) {
            for (int j = 0; i + j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println("\b");
        }
    }
}
