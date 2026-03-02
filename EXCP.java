// Use a custom message with chained exception
public class EXCP {

    public static void main(String[] args) {

        try {

            // Code that might throw an exception
            int[] n = new int[5];
            int divisor = 0;

            for (int i = 0; i < n.length; i++) {
                int res = n[i] / divisor;
                System.out.println(res);
            }

        } catch (ArithmeticException e) {

            // Creating a new exception with
            // the original as the cause
            throw new RuntimeException("Error: Division by zero occurred", e);
        }
    }
}