package week5;

public class LA3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayInfo();

        Car car2 = new Car("Model S", "Tesla");
        car2.displayInfo();

        Car car3 = new Car("Sonata", "Hyundai", 2020);
        car3.displayInfo();
    }
}