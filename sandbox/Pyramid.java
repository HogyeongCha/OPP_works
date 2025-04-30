package sandbox;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j1 = 0; j1 < n - i - 1; j1++) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < 2 * i + 1; j2++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

