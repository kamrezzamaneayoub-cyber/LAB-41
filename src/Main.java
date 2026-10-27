
class Car {

    // Private fields
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    // Constructor
    public Car(String model, String brand, int year,
               double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Delivery method
    public void delivery(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " Toyota C-HR cars delivered.");
        } else {
            System.out.println("Invalid delivery quantity.");
        }
    }

    // Sell method
    public void sell() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Toyota C-HR sold successfully!");
        } else {
            System.out.println("No cars available in stock.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        // Create a Toyota C-HR object
        Car car = new Car(
                "C-HR",
                "Toyota",
                2024,
                32000.0,
                "Black",
                5
        );

        // Display initial information
        System.out.println("=== Initial Car Information ===");
        System.out.println(car);

        // Sell one car
        System.out.println("\n=== Selling a Car ===");
        car.sell();

        // Display information using getters
        System.out.println("\n=== Car Information ===");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice() + " EUR");
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        // Update information using setters
        System.out.println("\n=== Updating Car Information ===");
        car.setModel("C-HR Hybrid");
        car.setPrice(35000.0);
        car.setColor("White");

        // Deliver three more cars
        car.delivery(3);

        // Display final information
        System.out.println("\n=== Updated Car Information ===");
        System.out.println(car);
    }
}
