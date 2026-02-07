abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);
}

class SimpleCalculator extends Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator c = new SimpleCalculator();
        System.out.println(c.add(10, 5));
        System.out.println(c.subtract(10, 5));
        System.out.println(c.multiply(10, 5));
        System.out.println(c.divide(10, 5));
    }
}
