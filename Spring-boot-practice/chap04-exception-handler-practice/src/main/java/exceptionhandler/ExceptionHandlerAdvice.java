package exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentialsException.class)
    public String InvalidCredentialsException(InvalidCredentialsException e) {
        return "error/401";
    }
}
