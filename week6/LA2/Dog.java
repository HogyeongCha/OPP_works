package week6.LA2;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void move() {
        System.out.println(name + " is running");
    }
}
