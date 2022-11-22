package Vehicle;

public class Motorbike extends Vehicle {

    private boolean sideCar;

    public Motorbike(int maxOccupancy, int numberOfWheels, boolean sideCar) {
        super(maxOccupancy, numberOfWheels);
        this.sideCar = sideCar;
    }



}
