package RideSharingApp.V1;

import java.util.*;

public class RideSharingAppService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengerList = new ArrayList<>();

    //Methods to add Drivers and passenger


    public void addDriver(Driver driver) {
        drivers.add(driver);

    }
    public void addPassenger(Passenger passenger)
    {
        passengerList.add(passenger);
    }
    // Booking ride

    public void bookRide(Passenger passenger,double distance)
    {
        if(drivers.isEmpty()) {
            System.out.println("No drivers are available for " + passenger.name);
            return;
        }
        Driver assignedDriver=null;
        double minDistance=Double.MAX_VALUE;
        for(Driver driver :drivers)
        {
            double currentDist=calcDistance(passenger.location,driver.location);
            if(currentDist<minDistance)
            {
                minDistance=currentDist;
                assignedDriver=driver;
            }
        }
        double expectedFare=calcFare(assignedDriver.vehicle,distance);

        System.out.println("Ride booked for "+passenger.name+" with driver "+assignedDriver.name+" for a fare of "+expectedFare);
        System.out.println("Driver on the way "+assignedDriver.name);
    }

    private double calcFare(Vehicle vehicle, double distance)
    {
        if(vehicle.getType().equals("Car"))
            return distance*20;
        else if(vehicle.getType().equals("Bike"))
            return distance*10;
        else
            return distance*8;
    }

    private double calcDistance(Location one, Location two)
    {
            double dx=one.getLat()- two.getLat();
            double dy=one.getLongitude()-two.getLongitude();
            return Math.sqrt(dx*dx+dy*dy);
    }
}