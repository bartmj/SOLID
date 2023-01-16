package L.correct;

public class Main {
    public static void main(String[] args) {

        // we use the substitution of the parent class with the subclass
        MarineVehicle vehicle = new Boat();

        vehicle.setSpeed(100);
        vehicle.sail();
    }
}

