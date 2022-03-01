package main;

import model.User;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Eva", 0, 500));
        users.add(new User("Sarah", 1, 500));
        users.add(new User("Rahma", 2, 500));
        users.add(new User("Winnona", 3, 500));

        showUsers(users);

        sendPoints(users.get(0), users.get(1), 100);
        System.out.println("");
        showUsers(users);
    }

    private static void showUsers(ArrayList<User> userList){
        System.out.println("Users (Name, ID, Points)");
        Iterator value = userList.iterator();
        while (value.hasNext()){
            User userData = (User) value.next();
            System.out.println(userData.getName() + ", " + userData.getId() + ", " + userData.getPoints());
        }
    }

    private static void sendPoints(User sender, User receiver, int points){
        sender.setPoints(sender.getPoints() - points);
        receiver.setPoints(receiver.getPoints() + points);
    }
}
