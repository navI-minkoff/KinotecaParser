package main.exception;

import main.exception.custom.ExternalApiException;
import main.exception.custom.MovieNotFoundInDbException;
import main.exception.custom.MovieNotFoundInExternalApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MovieNotFoundInExternalApiException.class)
    public ResponseEntity<ExceptionDetails> handleMovieNotFoundInApiException(MovieNotFoundInExternalApiException e) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), e.toString());
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MovieNotFoundInDbException.class)
    public ResponseEntity<ExceptionDetails> handleMovieNotFoundInDbException(MovieNotFoundInDbException e) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), e.toString());
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ExternalApiException.class)
    public ResponseEntity<ExceptionDetails> handleExternalApiException(ExternalApiException e) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), e.toString());
        HttpStatus httpStatus = HttpStatus.resolve(e.getStatusCode()) != null ? HttpStatus.resolve(e.getStatusCode()) : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(exceptionDetails, httpStatus);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDetails> globalExceptionHandler(Exception e) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), e.toString());
        return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


