package Liskov_substitution_principle.correct;

public abstract class AmphibiousVehicle implements Vehicle {

    protected abstract void sail();
    protected abstract void drive();

    @Override
    public void setSpeed(int speed) {
        // sets speed
    }
}
