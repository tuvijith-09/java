final class Vehicle {
    final int MAX_SPEED = 120;

    final void displayMaxSpeed() {
        System.out.println("Maximum speed is: " + MAX_SPEED);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayMaxSpeed();
    }
}
