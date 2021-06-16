package com.jcs.fr.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jcs.fr.response.OpenWeatherResponse;

@Service
public class OpenWeatherApiService {

	private static final String OW_API_KEY = "f893dd7222ce52e6e0cfdc7c5f850f7c";
	private static final String SG_API_KEY = "dfef7f20-c7ea-11eb-862d-0242ac130002-dfef7fa2-c7ea-11eb-862d-0242ac130002";
	private final String[] UNITS = {"imperial", "metric", "standard"};
	private final RestTemplate rt = new RestTemplate();
	
	public OpenWeatherResponse getWeatherData(Double lat, Double lon) {
		String baseUrl = "https://api.openweathermap.org/data/2.5/onecall?lat=" + 
							lat + "&lon=" + lon + "&exclude=minutely, hourly, daily&units="+ 
							UNITS[0] + "&appid="+ OW_API_KEY;    
		ResponseEntity<OpenWeatherResponse> response = rt.getForEntity(baseUrl, OpenWeatherResponse.class);
		MediaType contentType = response.getHeaders().getContentType();
		HttpStatus statusCode = response.getStatusCode();  
		System.out.println(contentType.toString());
		System.out.println(statusCode.toString());
		System.out.println(response.getBody().toString());
		return response.getBody();
	}
	
}
