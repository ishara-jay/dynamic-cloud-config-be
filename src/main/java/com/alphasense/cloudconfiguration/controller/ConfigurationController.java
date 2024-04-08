package com.alphasense.cloudconfiguration.controller;

import com.alphasense.cloudconfiguration.dto.ConfigurationSaveRequestDTO;
import com.alphasense.cloudconfiguration.dto.ConfigurationSaveResponseDTO;
import com.alphasense.cloudconfiguration.service.ConfigurationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/configuration")
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @CrossOrigin()
    @PostMapping()
    public ConfigurationSaveResponseDTO saveConfiguration(@RequestBody ConfigurationSaveRequestDTO configurationSaveRequestDTO) {
        return this.configurationService.saveConfigurations(configurationSaveRequestDTO);
    }
}
