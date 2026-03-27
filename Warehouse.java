abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void reportStatus() {
        System.out.println("Battery ID: " + batteryId + ", Charge: " + chargeLevel + "%");
    }

    abstract void performTask();
}

class DroneRobot extends Robot {
    DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    void performTask() {
        if (chargeLevel < 15) {
            System.out.println("Low battery!");
        } else {
            chargeLevel -= 15;
            System.out.println("Drone task completed at 2x speed.");
            System.out.println("Charge: " + chargeLevel + "%");
        }
    }
}

class GroundRobot extends Robot {
    GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    void performTask() {
        if (chargeLevel < 5) {
            System.out.println("Low battery!");
        } else {
            System.out.println("Performing surface check...");
            chargeLevel -= 5;
            System.out.println("Ground task completed.");
            System.out.println("Charge: " + chargeLevel + "%");
        }
    }
}

public class Warehouse {
    public static void main(String[] args) {
        Robot[] fleet = {
            new DroneRobot("D-1", 20.0),
            new GroundRobot("G-5", 10.0),
            new DroneRobot("D-2", 10.0)
        };

        for (Robot r : fleet) {
            r.performTask();
        }
    }
}