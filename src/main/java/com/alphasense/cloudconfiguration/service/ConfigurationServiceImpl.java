package com.alphasense.cloudconfiguration.service;

import com.alphasense.cloudconfiguration.dto.ConfigurationSaveRequestDTO;
import com.alphasense.cloudconfiguration.dto.ConfigurationSaveResponseDTO;
import com.alphasense.cloudconfiguration.dto.ParamDTO;
import com.alphasense.cloudconfiguration.entity.Configuration;
import com.alphasense.cloudconfiguration.entity.Parameter;
import com.alphasense.cloudconfiguration.repository.ConfigurationRepository;
import com.alphasense.cloudconfiguration.repository.ParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;

    @Autowired
    ParameterRepository parameterRepository;

    @Override
    public ConfigurationSaveResponseDTO saveConfigurations(ConfigurationSaveRequestDTO configurationSaveRequestDTO) {
        //TODO: do validations first

        Configuration savedConfig = saveConfigurationRecord(configurationSaveRequestDTO.getCloudProvider());
        saveParameters(configurationSaveRequestDTO.getParams(), savedConfig.getRecordId());

        ConfigurationSaveResponseDTO configurationSaveResponseDTO = new ConfigurationSaveResponseDTO();
        configurationSaveResponseDTO.setRecordId(savedConfig.getRecordId());
        configurationSaveResponseDTO.setCloudProvider(savedConfig.getCloudProvider());

        return configurationSaveResponseDTO;
    }

    private void saveParameters(List<ParamDTO> paramDTOS, int recordId) {
        List<Parameter> params = paramDTOS.stream()
                .map(paramDTO -> {
                    Parameter paramToAdd = new Parameter();
                    paramToAdd.setParamType(paramDTO.getParamType());
                    paramToAdd.setParamKey(paramDTO.getParamKey());
                    paramToAdd.setParamValue(paramDTO.getParamValue());
                    paramToAdd.setRecordId(recordId);
                    return paramToAdd;
                }).collect(Collectors.toList());
        this.parameterRepository.saveAll(params);
    }

    private Configuration saveConfigurationRecord(String cloudProvider) {
        Configuration newConfiguration = new Configuration();
        newConfiguration.setCloudProvider(cloudProvider);
        this.configurationRepository.save(newConfiguration);
        return newConfiguration;
    }

}
