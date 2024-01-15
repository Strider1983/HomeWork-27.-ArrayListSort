package org.example.exeptions;

public class CellIsNotEmptyExeption extends RuntimeException{
    public CellIsNotEmptyExeption(String message) {
        super(message);
    }
}
