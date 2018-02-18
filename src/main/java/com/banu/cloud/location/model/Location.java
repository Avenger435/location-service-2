package com.banu.cloud.location.model;

import java.util.List;

public class Location {

	private String city;
	private String geoid;
	private List<Location> locations;
	
	public Location() {
		
	}
	
	public Location(String city, String geoid) {
		this.city = city;
		this.geoid=geoid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGeoid() {
		return geoid;
	}

	public void setGeoid(String geoid) {
		this.geoid = geoid;
	}
	
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	
}
