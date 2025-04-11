package week6.LA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SharpPencil sharpPencil = new SharpPencil();
        int amount = scanner.nextInt();
        int width = scanner.nextInt();
        sharpPencil.setAmount(amount);
        sharpPencil.setWidth(width);
        System.out.println(sharpPencil.getAmount());
        System.out.println(sharpPencil.getWidth());

        Ballpen ballpen = new Ballpen();
        amount = scanner.nextInt();
        String color = scanner.next();
        ballpen.setAmount(amount);
        ballpen.setColor(color);
        System.out.println(ballpen.getAmount());
        System.out.println(ballpen.getColor());

        FountainPen fountainPen = new FountainPen();
        amount = scanner.nextInt();
        color = scanner.next();
        int refill = scanner.nextInt();
        fountainPen.setAmount(amount);
        fountainPen.setColor(color);
        fountainPen.refill(refill);
        System.out.println(fountainPen.getAmount());
        System.out.println(fountainPen.getColor());
    }
}
