package L.incorrect;

public class Main {
    public static void main(String[] args) {

        // we use the substitution of the parent class with the subclass
        Vehicle vehicle = new Boat();

        vehicle.drive();

    }
}

