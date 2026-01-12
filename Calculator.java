public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10, b = 15, sum;
        sum = add(a, b);

        System.out.println("Addition: " + sum);
    }
}
