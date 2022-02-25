package com.jcs.ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jcs.ff.response.*;
import com.jcs.ff.service.*;

@Controller
public class LocationsController {
	 
	@Autowired
	private OpenWeatherApiService weatherService;
	@Autowired
	private StormGlassApiService stormGlassService;
	
	@GetMapping("/location/map")
	public String getLocationMapView(Model model, @RequestParam Double lat, 
									@RequestParam Double lon) {
		StormGlassResponse tide = stormGlassService.getTide(lat, lon);
		OpenWeatherResponse locationWeather = weatherService.getWeatherData(lat, lon);
		model.addAttribute("tide", tide);
		model.addAttribute("weatherData", locationWeather);
	
		return "locations/location";
	}

}
