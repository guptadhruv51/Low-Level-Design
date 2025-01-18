package BehaviouralPatterns.StatePattern.GoodCode;

public class Client
{
    public static void main(String[] args) {
        DirectionServiceII directionServiceII=new DirectionServiceII(new Car());
        System.out.println(directionServiceII.getETA());
        System.out.println(directionServiceII.getDirections());
    }
}
