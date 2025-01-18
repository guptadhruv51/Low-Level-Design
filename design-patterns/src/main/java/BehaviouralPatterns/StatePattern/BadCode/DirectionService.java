package BehaviouralPatterns.StatePattern.BadCode;
enum TransportMode
{
    Walking, Cycling, Car, Train
}

public class DirectionService
{
    private TransportMode transportMode;
    public DirectionService(TransportMode mode)
    {
        this.transportMode=mode;
    }
    public void setMode(TransportMode mode)
    {
        this.transportMode=mode;
    }

    //Method to calc EDA
    public int getETA()
    {
        switch(transportMode)
        {
            case Walking:
                System.out.println("ETA for Walking");
                return 10;
            case Cycling:
                System.out.println("ETA for cycling");
                return 20;
            case Car:
                System.out.println("ETA for Car");
                return 5;
            case Train:
                System.out.println("ETA for train");
                return 2;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }
        }


}


