package StructureDesignPatterns.ProxyPattern.Problem;

public class Client
{
    public static void main(String[] args) {
        Image image=new RealImage("dog.png");
       // image.display();
    }
}
