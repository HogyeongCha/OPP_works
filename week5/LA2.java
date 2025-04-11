package week5;

import java.util.Scanner;

public class LA2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ShoppingList[] items = ShoppingList.createOrder(n);
        int totalAmount = 0;
        System.out.println("\nAll items entered:");
        for (int j = 0; j < n; j++) {
            items[j].printOrders();
            totalAmount += items[j].getTotalAmount();
        }
        System.out.println("\nMoney needed: " + totalAmount + " Won");
    }
}
