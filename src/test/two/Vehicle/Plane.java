package test.two.Vehicle;

public class Plane implements Vehicle {
    protected int numOfWheels;
    protected int numOfPassengers;
    protected boolean hasGas;

    public Plane(int numOfWheels, int numOfPassengers, boolean hasGas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.hasGas = hasGas;
    }

    @Override
    public int set_num_of_wheels() {
        return numOfWheels;
    }

    @Override
    public int set_num_of_passengers() {
        return numOfPassengers;
    }

    @Override
    public boolean has_gas() {
        return hasGas;
    }
}
