package Vehicle;

public abstract class Vehicle {

    private int numberOfWheels;
    private int maxOccupancy;

    public Vehicle(int maxOccupancy, int numberOfWheels){
        this.maxOccupancy = maxOccupancy;
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
//Method
    public String beepHorn(){
        return "BEEP!";
    }
}
