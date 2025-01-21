package CreationalPatterns.Factorypattern.Solution;

public class TransportFactory
{
    public static Transport createTransport(String type)
    {
        switch(type) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Illegal transport type");

        }

    }
}
