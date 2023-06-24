package com.spring.instagram.exception;

import com.spring.instagram.modal.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(NotFoundException ex)
    {
        Error error = new Error(ex.getMessage(), 404);
       return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestExceptiion.class)
    public ResponseEntity<Object> handleBadRequestException(BadRequestExceptiion ex)
    {
        Error error = new Error(ex.getMessage(), 400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
