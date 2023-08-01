package com.isila.weatherapi.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomAirPollutionAndWeatherCountryInformationResponse extends CustomAirPollutionAndWeatherInformationResponse {
    private String countryName;
}
