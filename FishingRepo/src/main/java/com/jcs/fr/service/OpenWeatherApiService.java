package com.jcs.fr.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jcs.fr.response.OpenWeatherResponse;

@Service
public class OpenWeatherApiService {

	private static final String API_KEY = "f893dd7222ce52e6e0cfdc7c5f850f7c";
	
	private final String[] UNITS = {"imperial", "metric", "standard"};
	private final RestTemplate rt = new RestTemplate();
	
	public OpenWeatherResponse getWeatherData(Double lat, Double lon) {
		String baseUrl = "https://api.openweathermap.org/data/2.5/onecall?lat=" + 
							lat + "&lon=" + lon + "&exclude=minutely, hourly, daily&units="+ 
							UNITS[0] + "&appid="+ API_KEY;    
		ResponseEntity<OpenWeatherResponse> response = rt.getForEntity(baseUrl, OpenWeatherResponse.class);
		MediaType contentType = response.getHeaders().getContentType();
		HttpStatus statusCode = response.getStatusCode();  
		System.out.println(contentType.toString());
		System.out.println(statusCode.toString());
		System.out.println(response.getBody().toString());
		return response.getBody();
	}
	
}
