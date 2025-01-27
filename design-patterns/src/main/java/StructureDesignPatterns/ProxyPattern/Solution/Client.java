package StructureDesignPatterns.ProxyPattern.Solution;

public class Client
{
    public static void main(String[] args) {
        Image image=new ProxyImage("dog.png");
        Image image2=new ProxyImage("cat.png");
        image.display();
       image.display();
    }
}
