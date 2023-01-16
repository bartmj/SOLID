package Liskov_substitution_principle.incorrect;

public class Boat extends Vehicle {

    public void sail() {
        System.out.println("The boat is sailing");
    }

    @Override
    public void drive() {

    }

    @Override
    protected void setSpeed(int speed) {
        // implementation for the boat stop method
    }
}
