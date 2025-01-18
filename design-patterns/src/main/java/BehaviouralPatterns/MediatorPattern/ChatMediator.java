package BehaviouralPatterns.MediatorPattern;

public interface ChatMediator
{
        void sendMessage(String msg, User user);
        void adduser(User user);
}
