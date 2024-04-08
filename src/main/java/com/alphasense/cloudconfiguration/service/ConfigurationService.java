package com.alphasense.cloudconfiguration.service;


import com.alphasense.cloudconfiguration.dto.ConfigurationSaveRequestDTO;
import com.alphasense.cloudconfiguration.dto.ConfigurationSaveResponseDTO;

public interface ConfigurationService {
    ConfigurationSaveResponseDTO saveConfigurations(ConfigurationSaveRequestDTO configurationSaveRequestDTO);
}
