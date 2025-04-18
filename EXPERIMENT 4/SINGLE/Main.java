class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks at strangers");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Inherited method
        myDog.bark();  // Own method
    }
}
