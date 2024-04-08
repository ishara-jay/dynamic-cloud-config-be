package com.alphasense.cloudconfiguration.util.validator;

import com.alphasense.cloudconfiguration.dto.ConfigurationSaveRequestDTO;
import com.alphasense.cloudconfiguration.exception.FailedValidationException;

public interface ValidationStrategy {
    void validate(ConfigurationSaveRequestDTO configurationSaveRequestDTO) throws FailedValidationException;
}
