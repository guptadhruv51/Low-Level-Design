package BehaviouralPatterns.StatePattern.GoodCode;

import BehaviouralPatterns.StatePattern.BadCode.DirectionService;

public class DirectionServiceII
{
    TransportationMode transportationMode;
    DirectionServiceII(TransportationMode transportationMode)
    {
        this.transportationMode=transportationMode;
    }
    public void setTransportationMode(TransportationMode transportationMode)
    {
        this.transportationMode=transportationMode;
    }

    public int getETA()
    {
        return this.transportationMode.calcETA();
    }

    public String getDirections()
    {
        return this.transportationMode.getDirection();
    }


}
