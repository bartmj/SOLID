package Liskov_substitution_principle.incorrect;

public class Motorcycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The motorcycle is driving.");
    }

    @Override
    protected void setSpeed(int speed) {
        // implementation for the boat stop method
    }

}
