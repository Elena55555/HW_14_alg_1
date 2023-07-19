package com.sky.pro.algorithms_the_first;

public class NoFreeCellsArrayIsFullException extends RuntimeException{
    public NoFreeCellsArrayIsFullException() {
    }

    public NoFreeCellsArrayIsFullException(String message) {
        super(message);
    }

    public NoFreeCellsArrayIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFreeCellsArrayIsFullException(Throwable cause) {
        super(cause);
    }
}
