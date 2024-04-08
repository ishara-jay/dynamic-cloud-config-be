package com.alphasense.cloudconfiguration.dto.providersettings;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataField implements Serializable {
    private String label;
    private String regex;
    private String type;
    private boolean required;
    private List<String> possibleValues;
}
