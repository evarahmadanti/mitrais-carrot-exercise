package main;

import com.sun.prism.shader.AlphaOne_ImagePattern_AlphaTest_Loader;
import model.History;
import model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Eva", 0, 500));
        users.add(new User("Sarah", 1, 500));
        users.add(new User("Rahma", 2, 500));
        users.add(new User("Winnona", 3, 500));

        showUsers(users);

        System.out.println("");
        System.out.println("Transactions History");
        sendPoints(users.get(0), users.get(1), 100);
        sendPoints(users.get(2), users.get(1), 100);
        showUsers(users);
    }

    private static void showUsers(ArrayList<User> userList){
        Iterator value = userList.iterator();
        System.out.println("");
        System.out.println("User List Update");
        while (value.hasNext()){
            User userData = (User) value.next();
            System.out.println(userData.getName() + ", " + userData.getId() + ", " + userData.getPoints());
        }
    }

    private static void sendPoints(User sender, User receiver, int points){
        sender.setPoints(sender.getPoints() - points);
        receiver.setPoints(receiver.getPoints() + points);
        Date now = new Date();
        ArrayList<History> historyList = new ArrayList<>();
        historyList.add(new History(sender.getName(), receiver.getName(), sender.getId(), points, now));
        getHistory(historyList);
    }

    private static void getHistory(ArrayList<History> historyList){
        Iterator value = historyList.iterator();
        while (value.hasNext()){
            History transactionHistory = (History) value.next();
            System.out.println(transactionHistory.getSender() + " with id " +
                    transactionHistory.getIdHistory() + " sent " + transactionHistory.getPointsHistory() + " to " +
                    transactionHistory.getReceiver() + " on " + transactionHistory.getDate());
        }
    }
}
