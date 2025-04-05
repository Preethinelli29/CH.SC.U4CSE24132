class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Addition {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(2, 3): " + calc.add(2, 3));
        System.out.println("add(1, 2, 3): " + calc.add(1, 2, 3));
        System.out.println("add(2.5, 3.7): " + calc.add(2.5, 3.7));
    }
}
