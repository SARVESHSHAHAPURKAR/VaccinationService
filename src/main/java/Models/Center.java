package Models;

import java.util.HashMap;
import java.util.Map;

public class Center {

    private String state;

    private String district;

    private String name;

    Map<Integer, Integer> dayToCapacity;

    Map<String, Booking> bookings;

    public Center(String state, String district, String name) {
        this.state = state;
        this.district = district;
        this.name = name;

        this.dayToCapacity = new HashMap<>();
        this.bookings = new HashMap<>();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Integer> getDayToCapacity() {
        return dayToCapacity;
    }

    public void setDayToCapacity(Map<Integer, Integer> dayToCapacity) {
        this.dayToCapacity = dayToCapacity;
    }

    public Map<String, Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Map<String, Booking> bookings) {
        this.bookings = bookings;
    }
}
