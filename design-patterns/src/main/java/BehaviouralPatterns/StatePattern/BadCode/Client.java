package BehaviouralPatterns.StatePattern.BadCode;

import BehaviouralPatterns.StatePattern.BadCode.DirectionService;
import BehaviouralPatterns.StatePattern.BadCode.TransportMode;

public class Client
{
    public static void main(String[] args) {
        DirectionService directionService=new DirectionService(TransportMode.Car);
        directionService.setMode(TransportMode.Cycling);
        System.out.println(directionService.getETA());
    }
}
