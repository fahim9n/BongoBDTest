package test.two.Vehicle;

public class PlaneFactory implements VehicleFactory {
    protected int numOfWheels;
    protected int numOfPassengers;
    protected boolean hasGas;

    public PlaneFactory(int numOfWheels, int numOfPassengers, boolean hasGas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.hasGas = hasGas;
    }

    @Override
    public Vehicle create() {
        return new Plane(numOfWheels, numOfPassengers, hasGas);
    }
}
