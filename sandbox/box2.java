package sandbox;

import java.util.Scanner;

public class box2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ilchan: ");
        double ilchan = scanner.nextDouble();
        System.out.print("hogyeong: ");
        double hogyeong = scanner.nextDouble();

        if (ilchan > hogyeong) {
            System.out.println("ilchan is taller than hogyeong.");
        }   else if (ilchan < hogyeong) {
            System.out.println("hogyeong is taller than ilchan.");
        }   else {
            System.out.println("their heights are same.");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
