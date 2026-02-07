interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Diamond problem solved");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
