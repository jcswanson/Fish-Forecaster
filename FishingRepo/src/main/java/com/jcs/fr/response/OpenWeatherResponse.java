package com.jcs.fr.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenWeatherResponse {

	private Double lat;
	private Double lon;
	private String timezone;
	
	@JsonProperty("timezone_offset")
	private Integer timeOffset;
	
	private CurrentWeather current;
	
	private List<WeatherAlerts> alerts = new ArrayList<>();
	
	
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Integer getTimeOffset() {
		return timeOffset;
	}
	public void setTimeOffset(Integer timeOffset) {
		this.timeOffset = timeOffset;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public CurrentWeather getCurrent() {
		return current;
	}
	public void setCurrent(CurrentWeather current) {
		this.current = current;
	}
	
	public List<WeatherAlerts> getAlerts() {
		return alerts;
	}
	public void setAlerts(List<WeatherAlerts> alerts) {
		this.alerts = alerts;
	}
	@Override
	public String toString() {
		return "OpenWeatherResponse [lat=" + lat + ", lon=" + lon + ", timezone=" + timezone + ", timeOffset="
				+ timeOffset + ", current=" + current + ", alerts=" + alerts + "]";
	}
	
	
}
