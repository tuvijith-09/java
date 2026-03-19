class Employee {
    String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + baseSalary * 0.05;
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        double salary = super.calculateSalary();
        salary += 2000;
        return salary;
    }
}

class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        double salary = super.calculateSalary();
        salary += baseSalary * 0.10;
        return salary;
    }
}

public class CaseStudy2 {

    public static void main(String[] args) {

        Employee e = new Employee("Tuvijith", 10000);
        System.out.printf("%.2f\n", e.calculateSalary());

        Manager m = new Manager("Shriya", 10000);
        System.out.printf("%.2f\n", m.calculateSalary());

        Executive ex = new Executive("Tanish", 10000);
        System.out.printf("%.2f\n", ex.calculateSalary());
    }
}