class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Animals {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound(); 
        p.bark();  
        p.weep(); 

        Cat c = new Cat();
        c.sound();
        c.meow();  
    }
}
