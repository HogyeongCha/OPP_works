package week6.LA2;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking gracefully");
    }
}
