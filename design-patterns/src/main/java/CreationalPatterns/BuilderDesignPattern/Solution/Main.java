package CreationalPatterns.BuilderDesignPattern.Solution;

public class Main
{
    public static void main(String[] args) {
        House house =new House.HouseBuilder("Concrete","Wood","Tile")
                .setGarden(true)
                .setHasSwimmingPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}
