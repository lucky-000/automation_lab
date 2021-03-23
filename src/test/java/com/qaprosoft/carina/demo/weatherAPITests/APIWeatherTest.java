package com.qaprosoft.carina.demo.weatherAPITests;


import org.json.JSONObject;
import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.apiWeather.GetCityCoordinateMetod;
import com.qaprosoft.carina.demo.apiWeather.GetCityWeatherMethod;
import com.qaprosoft.carina.demo.apiWeather.GetForecastWeatherMetod;

public class APIWeatherTest extends AbstractTest {
	 @Test(description = "JIRA#DEMO-0001")
	 @MethodOwner(owner = "amyrchyk")
	 public void checkingWeatherInCity() {
		 String city="Ternopil";
		 GetCityWeatherMethod getWeather = new GetCityWeatherMethod(city);
		 getWeather.expectResponseStatus(HttpResponseStatusType.OK_200);
		 getWeather.callAPI();
		 getWeather.validateResponseAgainstSchema("api/weather/_get/rs.schema");
	 }
	 @Test(description = "JIRA#DEMO-0003")
	 @MethodOwner(owner = "amyrchyk")
	 public void determiningCoordinateCity() {
		 String city="Chernivtsi";
		 GetCityCoordinateMetod getWeather = new GetCityCoordinateMetod(city);
		 getWeather.expectResponseStatus(HttpResponseStatusType.OK_200);
		 getWeather.callAPI();
		 getWeather.validateResponseAgainstSchema("api/location/_get/rs.schema");
	 }
	 @Test(description = "JIRA#DEMO-0002")
	 @MethodOwner(owner = "amyrchyk")
	 public void checkingForecastWeatherByCoordinateCity() {
		 String city="Chernivtsi";
		 GetCityCoordinateMetod getCoordinate = new GetCityCoordinateMetod(city);
		 getCoordinate.expectResponseStatus(HttpResponseStatusType.OK_200);
		 //delete first and last
		 String rs =  getCoordinate.callAPI().asString().substring(1, getCoordinate.callAPI().asString().length()-1);
		 getCoordinate.validateResponseAgainstSchema("api/location/_get/rs.schema");
		 JSONObject json = new JSONObject(rs);
		 String lon=Double.toString(((Number) json.get("lon")).doubleValue());
		 String lat=Double.toString(((Number) json.get("lat")).doubleValue());
//		 String lat="48.2908";
//		 String lon="25.9344";
		 GetForecastWeatherMetod getWeather = new GetForecastWeatherMetod(lat,lon);
		 getWeather.expectResponseStatus(HttpResponseStatusType.OK_200);
		 getWeather.callAPI();
		 getWeather.validateResponseAgainstSchema("api/forecast/_get/rs.schema");

	 }
	 

}
