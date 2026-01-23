class Demo {
    int x = 10;

    void show() {   // instance method
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
