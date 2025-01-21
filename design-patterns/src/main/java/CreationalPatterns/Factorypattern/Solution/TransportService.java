package CreationalPatterns.Factorypattern.Solution;

import CreationalPatterns.Factorypattern.Solution.Transport;

public class TransportService
{
    public static void main(String[] args) {
        Transport vehicle=TransportFactory.createTransport("car");
        vehicle.deliver();

    }
}
