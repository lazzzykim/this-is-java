package ch11.ex;

public class NotExistException extends Exception {
    public NotExistException() {
    }

    public NotExistException(String message) {
        super(message);
    }
}
