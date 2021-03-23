package com.qaprosoft.carina.demo.apiWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetForecastWeatherMetod extends AbstractApiMethodV2 {
	public GetForecastWeatherMetod(String lat, String lon) {
		super(null, null);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameterIfNotNull("lat", lat);	
        addParameterIfNotNull("lon", lon);	

	}
}
