package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//Observer Interface
interface Observer
{
    void update(float temp);
}
interface Subject
{
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
class WeatherStation implements Subject
{
    private float temp;
    private List<Observer> observerList;
    WeatherStation()
    {
        observerList=new ArrayList<>();

    }
    public void setTemp(float temp)
    {
        this.temp=temp;
        notifyObserver();
    }
    @Override
    public void attach(Observer observer)
    {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer)
    {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver()
    {
        for(Observer observer:observerList)
        {
            observer.update(temp); //Run time polymorphism
        }
    }
}
class DisplayDevice implements Observer
{
    @Override
    public void update(float temp) {
        System.out.println("Temp on display is: "+temp);
    }
}
class MobileDevice implements Observer
{
    @Override
    public void update(float temp)
    {
        System.out.println("Temp on mobile is: "+temp);

    }
}

public class ObserverPatternExample
{
    public static void main(String[] args)
    {

        WeatherStation weatherStation=new WeatherStation();

        DisplayDevice displayDevice=new DisplayDevice();
        MobileDevice mobileDevice=new MobileDevice();
        weatherStation.attach(displayDevice);
        weatherStation.attach(mobileDevice);

        weatherStation.setTemp(25);

        weatherStation.detach(mobileDevice);
        weatherStation.setTemp(27);

    }
}
