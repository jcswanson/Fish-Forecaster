package com.jcs.ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jcs.ff.response.OpenWeatherResponse;
import com.jcs.ff.service.OpenWeatherApiService;

@Controller
public class WeatherController {

	@Autowired
	private OpenWeatherApiService weatherData;
	
	@GetMapping("/forecast")
	public String getHomeView(Model model, @RequestParam Double lat, @RequestParam Double lon) {
		OpenWeatherResponse locationWeather = weatherData.getWeatherData(lat, lon);
		model.addAttribute("locationCoordinates", locationWeather);
		
		return "weather/weather";
	}
	
}
