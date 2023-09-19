package Models;

public class Booking {

    String id;

    String userName;

    String centerName;

    int day;

    public Booking(String id, String userName, String centerName, int day) {
        this.id = id;
        this.userName = userName;
        this.centerName = centerName;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
