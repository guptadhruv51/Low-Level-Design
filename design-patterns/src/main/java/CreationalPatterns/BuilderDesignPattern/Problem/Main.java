package CreationalPatterns.BuilderDesignPattern.Problem;

public class Main
{
    public static void main(String[] args) {
        House house=new House("Concrete","Wood","Shingles",true,false,true);
        System.out.println(house);

        //Constructor Explosion
        //Difficult to understand and maintain this code
        //Needs to be solved using a builder pattern
    }
}
