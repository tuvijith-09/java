import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    String trackingId;
    String destination;

    Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    abstract void dispatch();
}

interface GPS {
    void getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("40.7128° N, 74.0060° W");
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {
    Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}

class CargoShip extends Transport implements GPS {
    CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("25.276987° N, 55.296249° E");
    }
}

public class Logistic_System {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101", "City Center");
        t.dispatch();

        GPS g = new DeliveryDrone("D101", "City Center");
        g.getCoordinates();

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D101", "City Center"));
        list.add(new Truck("T202", "Warehouse"));
        list.add(new CargoShip("S303", "Port"));

        for (Transport obj : list) {
            obj.dispatch();

            if (obj instanceof GPS) {
                ((GPS) obj).getCoordinates();
            }
        }
    }
}