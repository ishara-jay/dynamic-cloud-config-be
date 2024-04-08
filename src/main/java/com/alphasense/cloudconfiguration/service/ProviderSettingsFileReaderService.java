package com.alphasense.cloudconfiguration.service;

import com.alphasense.cloudconfiguration.dto.providersettings.ProviderSettingsDTO;
import com.alphasense.cloudconfiguration.util.file.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderSettingsFileReaderService implements FileReaderService<ProviderSettingsDTO> {

    @Autowired
    private FileReader<ProviderSettingsDTO> fileReader;

    @Override
    public ProviderSettingsDTO readFile() {
        return this.fileReader.readFile("providerSettings.json");
    }
}
