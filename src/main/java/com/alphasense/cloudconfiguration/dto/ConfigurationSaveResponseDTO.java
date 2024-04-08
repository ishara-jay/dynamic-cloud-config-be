package com.alphasense.cloudconfiguration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigurationSaveResponseDTO {
    private int recordId;
    private String cloudProvider;
}
