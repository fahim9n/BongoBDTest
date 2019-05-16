package test.two.Vehicle;

public class CarFactory implements VehicleFactory {
    protected int numOfWheels;
    protected int numOfPassengers;
    protected boolean hasGas;

    public CarFactory(int numOfWheels, int numOfPassengers, boolean hasGas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.hasGas = hasGas;
    }

    @Override
    public Vehicle create() {
        return new Car(numOfWheels, numOfPassengers, hasGas);
    }
}
