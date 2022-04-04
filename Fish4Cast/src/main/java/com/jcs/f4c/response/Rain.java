package com.jcs.f4c.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("1h")
	private Double oneHourOfRain;

	public Double getOneHourOfRain() {
		return oneHourOfRain;
	}

	public void setOneHourOfRain(Double oneHourOfRain) {
		this.oneHourOfRain = oneHourOfRain;
	}

	public Rain(){

	}
	@Override
	public String toString() {
		return "Rain [oneHourOfRain=" + oneHourOfRain + "]";
	}
	
}
