package org.example.exeptions;

public class NumberNotFoundExeption extends RuntimeException{
    public NumberNotFoundExeption(String message) {
        super(message);
    }
}
