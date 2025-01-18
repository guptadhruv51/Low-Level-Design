package BehaviouralPatterns.StatePattern.GoodCode;

public class Walking implements TransportationMode
{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for walking");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Getting Directions for Walking";
    }
}
