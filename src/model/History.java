package model;
import java.util.Date;

public class History {
    private String sender, receiver;
    private int id, points;
    private Date date;

    public History(String sender, String receiver, int id, int points, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.id = id;
        this.points = points;
        this.date = date;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getIdHistory() {
        return id;
    }

    public void setIdHistory(int id) {
        this.id = id;
    }

    public int getPointsHistory() {
        return points;
    }

    public void setPointsHistory(int points) {
        this.points = points;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}