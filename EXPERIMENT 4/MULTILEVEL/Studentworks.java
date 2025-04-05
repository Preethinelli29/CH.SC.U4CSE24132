class Teacher {
    void walk() {
        System.out.println("she walks");
    }
}

class Student1 extends Teacher {
    void eat() {
        System.out.println("she eats");
    }
}

class Student2 extends Student1{
    void sleep() {
        System.out.println("she sleeps");
    }
}

public class Studentworks {
    public static void main(String[] args) {
        Student2 obj = new Student2();
        obj.walk();   
        obj.eat();  
        obj.sleep(); 
    }
}
