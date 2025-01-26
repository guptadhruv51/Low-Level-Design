package StructureDesignPatterns.DecoratorPattern.Solution;

public class OlivesDecorator extends PizzaDecorator
{
    public OlivesDecorator(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"Olives";
    }

    @Override
    public double getCost() {
        return super.getCost()+1.00;
    }
}
