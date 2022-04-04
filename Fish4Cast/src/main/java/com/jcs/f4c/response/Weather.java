package com.jcs.f4c.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	private Long id;
	
	@JsonProperty("main")
	private String weatherType;
	
	private String description;
	private String icon;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWeatherType() {
		return weatherType;
	}
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Weather [id=" + id + ", weatherType=" + weatherType + ", description=" + description + ", icon=" + icon
				+ "]";
	}
	
}
