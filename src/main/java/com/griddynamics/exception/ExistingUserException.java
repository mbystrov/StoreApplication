package com.griddynamics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT) // ToDo read how to change status message
public class ExistingUserException extends RuntimeException {

    public ExistingUserException() {
        super("User exists");
    }
}
