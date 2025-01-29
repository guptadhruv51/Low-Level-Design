package RideSharingApp.V1;

public class Vehicle
{
    String numPlate;
    String type;

    public Vehicle(String numPlate, String type) {
        this.numPlate = numPlate;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
