package BehaviouralPatterns.MediatorPattern;

public class Main
{
    public static void main(String[] args) {
        ChatMediator chatRoom=new ChatRoom();
        User Rahul=new User("Rahul",chatRoom);
        User amit=new User("amit",chatRoom);
        User neha=new User("neha",chatRoom);
        chatRoom.adduser(Rahul);
        chatRoom.adduser(neha);
        chatRoom.adduser(amit);
        amit.sendMessage("Hi Everyone");

    }
}
