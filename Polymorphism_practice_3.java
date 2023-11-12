//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.

class Employee {
    String role;

    Employee(String role) {
        this.role = role;
    }

    double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {

    double salary;

    Manager(Double salary) {
        super("Nanager");
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Programmer extends Employee {

    double salary;

    Programmer(Double salary) {
        super("Programmer");
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

public class App {

    public static void main(String[] args) {
        Employee e = new Manager(44.44);
        Employee p = new Programmer(48.39);

        System.out.println(e.calculateSalary());
        System.out.println(p.calculateSalary());
    }
}
