package com.alphasense.cloudconfiguration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParamDTO implements Serializable {
    private String paramType;
    private String paramKey;
    private String paramValue;
}
