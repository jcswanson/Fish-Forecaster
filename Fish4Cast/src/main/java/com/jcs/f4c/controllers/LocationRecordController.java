package com.jcs.f4c.controllers;

import com.jcs.f4c.entities.LocationRecord;
import com.jcs.f4c.entities.User;
import com.jcs.f4c.repository.LocationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jcs.f4c.response.*;
import com.jcs.f4c.service.*;

import java.security.Principal;

@Controller
public class LocationRecordController {
	 
	@Autowired
	private OpenWeatherApiService weatherService;
	@Autowired
	private StormGlassApiService stormGlassService;
	@Autowired
	private LocationRecordServiceImpl recordServiceImpl;
	@Autowired
	private LocationRecordRepository locationRecordRepository;
	@Autowired
	private JpaUserDetailsService jpaUserDetailsService;

	@GetMapping("/location/newRecord")
	public String getLocationMapView(Model model, @RequestParam Double lat, 
									@RequestParam Double lon) {
		StormGlassResponse oceanCondition = stormGlassService.getWaterConditions(lat, lon);
		OpenWeatherResponse locationWeather = weatherService.getWeatherData(lat, lon);
		StormGlassResponse tide = stormGlassService.getTide(lat, lon);
		model.addAttribute("oceanCondition", oceanCondition);
		model.addAttribute("locationWeather", locationWeather);
		LocationRecord locationRecord = new LocationRecord();
		locationRecord.setLat(lat);
		locationRecord.setLng(lon);
		locationRecord.setAirTemp(locationWeather.getCurrent().getTemp());
		locationRecord.setWaterTemp(oceanCondition.getWaterConditionHours().get(0).getWaterTemperature().getSg());
		locationRecord.setWaveDirection(oceanCondition.getWaterConditionHours().get(0).getSwellDirection().getSg());
		locationRecord.setWaveHeight(oceanCondition.getWaterConditionHours().get(0).getSwellHeight().getSg());
		locationRecord.setTide(tide.getTideData().get(0).getTideHeightInFt());

		model.addAttribute("locationRecord",locationRecord);


		return "locations/location";
	}

	@PostMapping("location/saveRecord")
	public String saveRecord(@ModelAttribute("locationRecord") LocationRecord locationRecord, Errors errors,
							 Principal principal){
		if(errors.hasErrors()){
			return "locations/location";
		}
		User user = jpaUserDetailsService.getUserByPrincipal(principal);
		recordServiceImpl.saveLocationRecord(locationRecord, user);
		return "redirect:/home";
	}
}
