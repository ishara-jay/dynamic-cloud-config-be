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
public class ProviderSettingsDTO implements Serializable {
    List<Provider> providers;
}
