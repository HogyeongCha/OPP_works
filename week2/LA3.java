package week2;

import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double won, dollar;

        System.out.print("Enter the amount in KRW : ");
        won = scanner.nextDouble();
        dollar = won / 1458.55;
        System.out.print("You will receive: " + dollar);
    }
}