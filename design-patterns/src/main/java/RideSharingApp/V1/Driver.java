package RideSharingApp.V1;

public class Driver
{
    String name;
    Location location;
    Vehicle vehicle;


    public Driver(String name, Location location,Vehicle vehicle) {
        this.name = name;
        this.location = location;
        this.vehicle=vehicle;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
