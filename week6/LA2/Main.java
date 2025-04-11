package week6.LA2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = null;
        Scanner s = new Scanner(System.in);

        String animalType = s.nextLine();
        String name = s.nextLine();
        Boolean isBig = s.nextBoolean();

        if (animalType.equalsIgnoreCase("Dog")) {
            animal = new Dog(name);
        } else if (animalType.equalsIgnoreCase("Cat")) {
            animal = new Cat(name);
        } else {
        }
        animal.setIsBig(isBig);
        animal.move();
        animal.makeSound();

        if (animal.getIsBig()) {
            System.out.println("and size is big");
        } else {
            System.out.println("and size is small");
        }
    }
}
