package com.alphasense.cloudconfiguration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigurationSaveRequestDTO {
    private String cloudProvider;
    private List<ParamDTO> params;
}
