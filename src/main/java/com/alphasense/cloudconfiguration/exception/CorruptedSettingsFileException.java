package com.alphasense.cloudconfiguration.exception;

public class CorruptedSettingsFileException extends Exception {

    public CorruptedSettingsFileException(String errorMessage, int statusCode) {
        super(errorMessage);
    }

}
