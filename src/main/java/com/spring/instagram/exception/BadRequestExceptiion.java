package com.spring.instagram.exception;

public class BadRequestExceptiion extends RuntimeException{

    public BadRequestExceptiion(String message)
    {
        super(message);
    }
}
