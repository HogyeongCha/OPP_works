package week7.LA2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        try {
            ValidateTriangle.isUnderZero(a, b, c);
            ValidateTriangle.isZero(a, b, c);
            ValidateTriangle.canBeTriangle(a, b, c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        int check = DistinguishTriangle.distinguish(a, b, c);
        switch (check) {
            case 0:
                System.out.println("right triangle");
                break;
            case 1:
                System.out.println("obtuse triangle");
                break;
            case 2:
                System.out.println("acute triangle");
                break;
        }
    }
}