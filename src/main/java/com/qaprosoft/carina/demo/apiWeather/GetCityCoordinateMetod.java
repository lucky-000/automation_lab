package com.qaprosoft.carina.demo.apiWeather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetCityCoordinateMetod extends AbstractApiMethodV2 {
	public GetCityCoordinateMetod(String city) {
		super(null, null);
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameterIfNotNull("q", city);	

	}
}
