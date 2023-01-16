package Liskov_substitution_principle.correct;

public class Motorcycle extends LandVehicle {
    @Override
    public void drive() {
        System.out.println("The motorcycle is driving.");
    }

    @Override
    public void setSpeed(int speed) {
        // implementation for the motorcycle setSpeed method
    }
}

