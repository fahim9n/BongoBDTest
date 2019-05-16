package test.two.Vehicle;

public class FourWheelGasCarFactory implements VehicleFactory {
    protected int numOfPassengers;

    public FourWheelGasCarFactory(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public Vehicle create() {
        return new Car(4, numOfPassengers, true);
    }
}
