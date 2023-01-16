package Liskov_substitution_principle.correct;

public class Car extends LandVehicle {
    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }

    @Override
    public void setSpeed(int speed) {
        // implementation for the car setSpeed method
    }
}
