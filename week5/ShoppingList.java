package week5;

import java.util.Scanner;

public class ShoppingList {
    String name;
    int price;
    int count;

    public ShoppingList(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public void printOrders() {
        System.out.println("Item Name: " + name + ", Price: " + price + " Won, Count: " + count);
    }

    public int getTotalAmount() {
        return price * count;
    }

    public static ShoppingList[] createOrder(int n) {
        Scanner scanner = new Scanner(System.in);
        ShoppingList[] items = new ShoppingList[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Item Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Count: ");
            int count = scanner.nextInt();
            scanner.nextLine();
            items[i] = new ShoppingList(name, price, count);
        }
        return items;
    }
}
