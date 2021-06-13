package com.jcs.fr.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherAlerts {

	@JsonProperty("sender_name")
	private String senderName;
	
	private String event;
	
	@JsonProperty("start")
	private Integer startTime;
	
	@JsonProperty("end")
	private Integer endTime;
	
	private String description;
	private List<String> tags = new ArrayList<>();
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "WeatherAlerts [senderName=" + senderName + ", event=" + event + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", description=" + description + ", tags=" + tags + "]";
	}
	
}
