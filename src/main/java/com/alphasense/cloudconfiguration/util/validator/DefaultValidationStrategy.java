package com.alphasense.cloudconfiguration.util.validator;

import com.alphasense.cloudconfiguration.dto.ConfigurationSaveRequestDTO;
import com.alphasense.cloudconfiguration.exception.FailedValidationException;
import org.springframework.stereotype.Component;

@Component
public class DefaultValidationStrategy implements ValidationStrategy {

    @Override
    public void validate(ConfigurationSaveRequestDTO configurationSaveRequestDTO) throws FailedValidationException {

    }
}
