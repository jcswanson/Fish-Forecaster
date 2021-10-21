package com.jcs.fr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jcs.fr.response.OpenWeatherResponse;
import com.jcs.fr.service.OpenWeatherApiService;

@Controller
public class LocationsController {
	 
	@Autowired
	private OpenWeatherApiService weatherService;
	
	@GetMapping("/location/map")
	public String getLocationMapView(Model model, @RequestParam Double lat, 
									@RequestParam Double lon) {
		OpenWeatherResponse locationWeather = weatherService.getWeatherData(lat, lon);
		model.addAttribute("weatherData", locationWeather);
	
		return "locations/location";
	}
	
}
