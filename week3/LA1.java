package week3;

import java.util.Scanner;
public class LA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean flag = false;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1+1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("'No even numbers found.'");
        }
        else {
            System.out.println("\b\b");
        }
    }
}
