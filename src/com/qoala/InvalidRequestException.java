package com.qoala;

public class InvalidRequestException extends RuntimeException {

    private static final long serialVersionUID = 6516832143282659332L;

    public InvalidRequestException(String reason) {
        super(reason);
    }
}
