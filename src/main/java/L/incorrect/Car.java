package L.incorrect;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }

    @Override
    protected void setSpeed(int speed) {
        // implementation for the car stop method
    }
}
