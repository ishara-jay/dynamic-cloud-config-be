package com.alphasense.cloudconfiguration.controller;

import com.alphasense.cloudconfiguration.dto.providersettings.ProviderSettingsDTO;
import com.alphasense.cloudconfiguration.service.FileReaderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@Log4j2
@RequestMapping("/provider-settings")
public class ProviderSettingsController {

    @Autowired
    private FileReaderService<ProviderSettingsDTO> fileReaderService;

    @CrossOrigin()
    @GetMapping
    private ProviderSettingsDTO getSettings() {
        return this.fileReaderService.readFile();
    }
}
