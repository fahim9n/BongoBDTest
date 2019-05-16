package test.two.Vehicle;

public abstract class VehicleBuilder {
    public int numOfWheels;
    public int numOfPassengers;
    public boolean hasGas;

    public VehicleBuilder setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
        return this;
    }

    public VehicleBuilder setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
        return this;
    }

    public VehicleBuilder setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
        return this;
    }

    public abstract Vehicle build();
}
