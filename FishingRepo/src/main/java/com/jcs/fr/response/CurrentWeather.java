package com.jcs.fr.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeather {

	@JsonProperty("dt")
	private Integer time;
	
	private Integer sunrise;
	private Integer sunset;
	private Double temp;
	
	@JsonProperty("feels_like")
	private Double tempFeelsLike;
	
	private Integer pressure;
	private Integer humidity;
	
	@JsonProperty("dew_point")
	private Double dewPoint;
	
	@JsonProperty("uvi")
	private Double uvIndex;
	
	private Integer clouds;
	private Integer visibility;
	
	@JsonProperty("wind_speed")
	private Integer windSpeed;
	
	@JsonProperty("wind_gust")
	private Integer windGust;
	
	@JsonProperty("wind_deg")
	private Integer windDirection;
	
	private List<Weather> weather = new ArrayList<>();
	private Rain rain;
	
	
	
	public Integer getWindGust() {
		return windGust;
	}

	public void setWindGust(Integer windGust) {
		this.windGust = windGust;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getSunrise() {
		return sunrise;
	}

	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}

	public Integer getSunset() {
		return sunset;
	}

	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getTempFeelsLike() {
		return tempFeelsLike;
	}

	public void setTempFeelsLike(Double tempFeelsLike) {
		this.tempFeelsLike = tempFeelsLike;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Double getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(Double dewPoint) {
		this.dewPoint = dewPoint;
	}

	public Double getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(Double uvIndex) {
		this.uvIndex = uvIndex;
	}

	public Integer getClouds() {
		return clouds;
	}

	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Integer getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Integer windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Integer getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(Integer windDirection) {
		this.windDirection = windDirection;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "CurrentWeather [time=" + time + ", sunrise=" + sunrise + ", sunset=" + sunset + ", temp=" + temp
				+ ", tempFeelsLike=" + tempFeelsLike + ", pressure=" + pressure + ", humidity=" + humidity
				+ ", dewPoint=" + dewPoint + ", uvIndex=" + uvIndex + ", clouds=" + clouds + ", visibility="
				+ visibility + ", windSpeed=" + windSpeed + ", windDirection=" + windDirection + ", weather=" + weather
				+ ", rain=" + rain + "]";
	}

	
	
}
