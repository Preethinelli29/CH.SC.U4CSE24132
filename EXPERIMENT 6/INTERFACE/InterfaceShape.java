interface Engine {
    void start();
}

interface Vehicle {
    void speedUp(int increment);
}

class Car implements Engine, Vehicle {
    int speed;

    public void start() {
        System.out.println("Car Engine Started.");
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

public class InterfaceCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.speedUp(20);
    }
}
