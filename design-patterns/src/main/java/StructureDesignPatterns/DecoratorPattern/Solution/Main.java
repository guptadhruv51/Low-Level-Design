package StructureDesignPatterns.DecoratorPattern.Solution;

public class Main
{
    public static void main(String[] args) {
        Pizza basicPizza=new BasicPizza();
        basicPizza=new CheeseDecorator(basicPizza);
        basicPizza=new OlivesDecorator(basicPizza);
        System.out.println(basicPizza.getCost());
        System.out.println(basicPizza.getDescription());

    }
}
