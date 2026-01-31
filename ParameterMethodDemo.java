
class ParameterMethodDemo {

    static void add(int a, int b) {   // parameterized method
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);  // command line input
        int y = Integer.parseInt(args[1]);

        add(x, y);
    }
}
