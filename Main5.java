class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dog barks");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.barks();
        
    }
}
