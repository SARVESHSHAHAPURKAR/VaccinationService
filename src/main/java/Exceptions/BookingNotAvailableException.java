package Exceptions;

public class BookingNotAvailableException extends RuntimeException{

    public BookingNotAvailableException() {
        super("Booking Not Available");
    }
}
