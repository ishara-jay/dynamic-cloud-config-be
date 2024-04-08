package com.alphasense.cloudconfiguration.exception;

import lombok.Getter;

@Getter
public class FailedValidationException extends Exception {

    private final int statusCode;

    public FailedValidationException(String errorMessage, int statusCode) {
        super(errorMessage);
        this.statusCode = statusCode;
    }
}
