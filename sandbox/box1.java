package sandbox;

import java.util.Scanner;
public class box1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        System.out.println("하고 싶은 내용 " + a);
        int var = scanner.nextInt();
        double var2 = scanner.nextDouble();

        double sum = a + var + var2;

        System.out.print("합은? " + sum);
    }
}
