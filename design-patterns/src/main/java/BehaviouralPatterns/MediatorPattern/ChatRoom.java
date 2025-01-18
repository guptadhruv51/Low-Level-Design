package BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator
{
    private List<User> userList;

    public ChatRoom() {
        this.userList =new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User users:userList)
        {
            if(users!=user)
        users.receiveMessage(msg,user);
        }
    }

    @Override
    public void adduser(User user) {
        userList.add(user);
    }
}
