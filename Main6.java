class Demo {
    Demo() {
        this("Default constructor");
    }

    Demo(String message) {
        System.out.println(message);
    }
}

public class Main6 {
    public static void main(String[] args) {
        new Demo();
    }
}
