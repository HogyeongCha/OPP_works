package week3;

import java.util.Scanner;
public class LA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many layers do you want your pyramid to be?");
        int num = scanner.nextInt();

        System.out.println("\nThe pyramid below shows the " + num + " layers");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
