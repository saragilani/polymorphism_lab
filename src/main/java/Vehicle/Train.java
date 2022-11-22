package Vehicle;

public class Train extends Vehicle{

    private int numberOfCarriages;
    private String destination;

    public Train(int maxOccupancy, int numberOfWheels, int numberOfCarriages, String destination){
        super(maxOccupancy, numberOfWheels);
        this.numberOfCarriages = numberOfCarriages;
        this.destination = destination;

    }

    @Override
    public String beepHorn() {
        return "CHOO! CHOO!";
    }

    public String makeAnnouncement() {
        return String.format("This train will split at Northampton. " +
                "Those headed to %s should move to carriages %s and below.",
                this.destination, this.numberOfCarriages - 2);
    }
}
