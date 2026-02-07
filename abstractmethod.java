abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal.eat();
    }
}