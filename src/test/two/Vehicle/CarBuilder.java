package test.two.Vehicle;

public class CarBuilder extends VehicleBuilder {
    @Override
    public Vehicle build() {
        return new Car(numOfWheels, numOfPassengers, hasGas);
    }
}
