class Person {
    void introduce() {
        System.out.println("Hi, I am Preethi.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("I teach students.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I study subjects.");
    }
}

public class Intro{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.introduce(); 
        t.teach();     

        Student s = new Student();
        s.introduce(); 
        s.study();     
    }
}
