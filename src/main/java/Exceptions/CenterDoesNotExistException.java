package Exceptions;

public class CenterDoesNotExistException extends RuntimeException{

    public CenterDoesNotExistException() {
        super("Center does not exist");
    }
}
