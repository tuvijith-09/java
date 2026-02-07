class Parent2 {
    int x = 10;
}

class Child extends Parent2 {
    int x = 20;

    void display() {
        System.out.println(super.x); // parent variable
        System.out.println(this.x);  // child variable
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
