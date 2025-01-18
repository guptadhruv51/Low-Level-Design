package BehaviouralPatterns.MediatorPattern;

public class User
{
    private ChatMediator chatMediator;
    private String name;
    public User(String name,ChatMediator chatMediator)
    {
        this.name=name;
        this.chatMediator=chatMediator;
    }
    public void sendMessage(String msg)
    {
        System.out.println(this.name+"Sending a msg "+msg);
        chatMediator.sendMessage(msg,this);
    }
    public String getName()
    {
        return this.name;
    }
    public void receiveMessage(String msg, User sender)
    {
        System.out.println(this.name+"recieved message: "+msg+" from "+sender.getName());
    }
}
