package StructureDesignPatterns.DecoratorPattern.Problem;

public class Main
{
    public static void main(String[] args) {
        Pizza pizza=new BasicPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
