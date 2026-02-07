class Parent {
    final void display() {
        System.out.println("Final method in parent class");
    }
}

class Child3 extends Parent {

}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.display();
    }
}
