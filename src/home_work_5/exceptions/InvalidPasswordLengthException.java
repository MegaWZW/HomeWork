package home_work_5.exceptions;

public class InvalidPasswordLengthException extends RuntimeException {
    public InvalidPasswordLengthException() {
    }

    public InvalidPasswordLengthException(String s) {
        super(s);
    }

    public InvalidPasswordLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPasswordLengthException(Throwable cause) {
        super(cause);
    }
}
