package week4;

import java.util.Scanner;

public class LA1 {

    public static int min(int[] arr) {
        int minimum = arr[0]; // Start with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of integers to input: ");
            int n = scanner.nextInt();

            if (n > 0) {
                System.out.print("Enter " + n + " integers: ");
                int[] array = new int[n];

                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                int min = min(array);
                int max = max(array);

                System.out.println("Min Integer: " + min);
                System.out.println("Max Integer: " + max);
            } else if (n < 0) {
                System.out.println("Please enter an integer greater than 0.");
            } else {
                System.out.println("Program Exit");
                break;
            }
        }
    }
}