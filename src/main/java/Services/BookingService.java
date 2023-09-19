package Services;

import Exceptions.BookingNotAvailableException;
import Exceptions.CenterDoesNotExistException;
import Models.Booking;
import enums.Gender;

import java.awt.print.Book;

public class BookingService {

    CenterService centerService;

    UserService userService;

    public BookingService(CenterService centerService, UserService userService) {
        this.centerService = centerService;
        this.userService = userService;
    }

    public void onboardUser(String ID, String name, Gender gender, int age, String state, String district) {

        userService.createUser(ID,name,gender,age,state, district);
    }

    public void addCenter(String state, String district, String name) {
        centerService.addCenter(state,district,name);
    }

    public void addCapacity(String centerName, int day, int capacity) {
        centerService.addCapacity(centerName, day, capacity);
    }

    public void listCenters(String district) {
        centerService.listCenters(district);
    }

    public void bookVaccination(String bookingId, String centerName, int day, String username) {

        if(centerService.getRepository().getCenters().get(centerName)==null){
            throw new CenterDoesNotExistException();
        }

        if(centerService.getRepository().getCenters().get(centerName).getDayToCapacity().getOrDefault(day,0)<1){
            throw new BookingNotAvailableException();
        }

        Booking booking = new Booking(bookingId, username, centerName, day);

        int newVacancy = centerService.getRepository().getCenters().get(centerName).getDayToCapacity().get(day)-1;

        centerService.getRepository().getCenters().get(centerName).getDayToCapacity().put(day,newVacancy);

        centerService.getRepository().getCenters().get(centerName).getBookings().put(booking.getId(),booking);

        System.out.println("Booking created with id "+booking.getId());
    }

    public void listAllBookingsForCenterAndDay(String name, int day) {

        centerService.listAllBookingsForCenterDay(name,day);
    }
}
