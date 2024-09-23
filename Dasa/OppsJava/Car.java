package OppsJava;

public class Car {
    // Encapsulation: Car class without getter and setter methods
    // Private attributes (encapsulated)
    private String make;
    private String model;
    private String color;
    private int speed;

    // Public constructor
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0; // Car starts at 0 speed
    }

    // Method to accelerate the car
    public void accelerate(int speedIncrease) {
        this.speed += speedIncrease;
        System.out.println("The car is now going " + this.speed + " mph.");
    }

    // Method to brake the car
    public void brake(int speedDecrease) {
        if (this.speed - speedDecrease < 0) {
            this.speed = 0;
        } else {
            this.speed -= speedDecrease;
        }
        System.out.println("The car slowed down to " + this.speed + " mph.");
    }


    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("Toyota", "Corolla", "Red");

        // Display initial car details
        System.out.println("Initial Car Details:");
        System.out.println(car1);

        // Accelerate the car
        car1.accelerate(30);

        // Brake the car
        car1.brake(10);

        // Display updated car details
        System.out.println("Updated Car Details:");
        System.out.println(car1);
    }
}


