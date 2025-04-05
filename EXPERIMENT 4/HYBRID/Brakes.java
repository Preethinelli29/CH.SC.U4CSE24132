interface Engine {
    void start();
}

interface Brake {
    void applyBrake();
}

class Vehicle {
    void fuelType() {
        System.out.println("Uses petrol or diesel");
    }
}

class Car extends Vehicle implements Engine, Brake {
    public void start() {
        System.out.println("Car engine started");
    }

    public void applyBrake() {
        System.out.println("Brakes applied");
    }
}

public class Brakes {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuelType();     
        c.start();        
        c.applyBrake();  
    }
}
