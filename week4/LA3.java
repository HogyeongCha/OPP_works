package week4;

import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of scores: ");
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("Exit the program");
                break;
            } else if (n < 0) {
                System.out.println("The number of scores should be more than one.");
            } else {
                int[] array = new int[n];
                boolean validInput = false;
                boolean isFirstAttempt = true;

                while (!validInput) {
                    if (isFirstAttempt) {
                        System.out.print("Enter " + n + " scores: ");
                        isFirstAttempt = false;
                    } else {
                        System.out.println("The score should be in the range of (0~100).");
                        System.out.print("Please enter " + n + " scores again: ");
                    }

                    validInput = true;
                    for (int i = 0; i < n; i++) {
                        int input = scanner.nextInt();
                        array[i] = input;
                    }
                    for (int j = 0; j < n; j++) {
                        if (array[j] > 100 || array[j] < 0) {
                            validInput = false;
                            break;
                        }
                    }

                }

                String result = calculateGrade(array);
                System.out.println("The grade is " + result);
            }
        }
    }

    public static String calculateGrade(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = (double) sum / array.length;

        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
