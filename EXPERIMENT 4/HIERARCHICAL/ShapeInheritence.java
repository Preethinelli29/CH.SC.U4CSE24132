class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = π * r * r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle = length * breadth");
    }
}

public class ShapeInheritence {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
