package com.jcs.ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jcs.ff.service.OpenWeatherApiService;


@Controller
public class IndexController {

	@Autowired
	private OpenWeatherApiService weatherService;
	
	@GetMapping("/")
	public String getHomeView() {
		
		return "home/index";
	}

}
