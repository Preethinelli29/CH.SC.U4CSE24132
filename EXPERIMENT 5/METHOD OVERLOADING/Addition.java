class Display {
    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(int age) {
        System.out.println("Age: " + age);
    }

    void show(double score) {
        System.out.println("Score: " + score);
    }
}

public class Marks{
    public static void main(String[] args) {
        Display d = new Display();
        d.show("Preethi");
        d.show(19);
        d.show(95.5);
    }
}
