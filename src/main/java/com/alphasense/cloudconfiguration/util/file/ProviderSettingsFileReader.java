package com.alphasense.cloudconfiguration.util.file;

import com.alphasense.cloudconfiguration.dto.providersettings.ProviderSettingsDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class ProviderSettingsFileReader implements FileReader<ProviderSettingsDTO> {

    @Override
    public ProviderSettingsDTO readFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ClassPathResource classPathResource = new ClassPathResource(filePath);
            File file = classPathResource.getFile();
            return objectMapper.readValue(file, ProviderSettingsDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
