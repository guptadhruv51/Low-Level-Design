package BehaviouralPatterns.StatePattern.GoodCode;

public class Car implements TransportationMode
{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Car");
        return 25;
    }

    @Override
    public String getDirection() {
        return "'Directions for Car";
    }
}
