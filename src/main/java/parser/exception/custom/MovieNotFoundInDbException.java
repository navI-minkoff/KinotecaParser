package parser.exception.custom;

public class MovieNotFoundInDbException extends RuntimeException {

    public MovieNotFoundInDbException(String message) {
        super(message);
    }
}
