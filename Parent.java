class Parent {
    int a = 10;
}

class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Value of a: " + obj.a);
    }
}
