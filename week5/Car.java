package week5;

public class Car {
    String model;
    String manufacturer;
    int year;

    public Car() {
        this("", "", 0);
    }

    public Car(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    public Car(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Manufacturer: " + manufacturer + ", Year: " + year);
    }
}
