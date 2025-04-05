class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar has turbo boost");
    }
}

public class Vehicles{
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();  
        sc.drive();  
        sc.turbo();     }
}
