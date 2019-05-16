package test.two.Vehicle;

public class PlaneBuilder extends VehicleBuilder {
    @Override
    public Vehicle build() {
        return new Plane(numOfWheels, numOfPassengers, hasGas);
    }
}
