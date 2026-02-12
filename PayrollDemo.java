import java.util.ArrayList;

class Staff {

    int employeeId;
    String name;
    String role;
    double baseSalary;
    double finalSalary;

    Staff(int employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {

        switch (role) {

            case "Manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;

            case "Developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;

            case "Designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;

            case "Intern":
                finalSalary = 1000;
                break;

            default:
                finalSalary = baseSalary;
        }
    }

    void applyDeduction(double amount) {
        finalSalary = finalSalary - amount;
    }

    void showDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: ₹" + finalSalary);
        System.out.println("---------------------");
    }
}

class SalarySystem {

    ArrayList<Staff> staffList = new ArrayList<>();

    void addEmployee(Staff s) {
        staffList.add(s);
    }

    Staff findEmployeeById(int id) {
        for (Staff s : staffList) {
            if (s.employeeId == id) {
                return s;
            }
        }
        return null;
    }

    void calculateAllSalaries() {
        for (Staff s : staffList) {
            s.calculateSalary();
            s.showDetails();
        }
    }
}

public class PayrollDemo {

    public static void main(String[] args) {

        SalarySystem system = new SalarySystem();

        Staff e1 = new Staff(1, "Rahul", "Manager", 50000);
        Staff e2 = new Staff(2, "Priya", "Developer", 40000);
        Staff e3 = new Staff(3, "Arjun", "Intern", 0);

        system.addEmployee(e1);
        system.addEmployee(e2);
        system.addEmployee(e3);

        system.calculateAllSalaries();

        Staff found = system.findEmployeeById(2);

        if (found != null) {
            found.applyDeduction(2000);
            System.out.println("After Deduction:");
            found.showDetails();
        }
    }
}
