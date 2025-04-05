class Employee {
    private double salary;

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary can't be negative!");
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(45000);
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(-1000);  // trying to set negative salary
    }
}
