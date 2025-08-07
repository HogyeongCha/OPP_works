package week15.LA1;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        integerBox.printItem();

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, world!");
        stringBox.printItem();
    }
}