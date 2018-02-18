package com.banu.cloud.location.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banu.cloud.location.intercomm.LocationClient;
import com.banu.cloud.location.model.Location;

@RestController
public class Api {
	@Autowired
	private LocationClient locationClient;
	
	protected Logger logger = Logger.getLogger(Api.class.getName());
	
	private List<Location> locations;
	
	public Api() {
		
		locations = new ArrayList<>();
		locations.add(new Location("Singapore", "100"));
		locations.add(new Location("Aarhus", "101"));
		locations.add(new Location("New York", "102"));
		
	}
	@RequestMapping("/location/{city}")
	public Location findbyCity(@PathVariable("city") String city) {
		logger.info(String.format("Location find by City", city));
		Location location= locations.stream().filter(it -> it.getCity().equals(city)).findFirst().get();
		List<Location> locations= locationClient.findbyCity(city);
		location.setLocations(locations);
		return location;
	}
	
	@RequestMapping("/locations")
	public List<Location> findall(){
		logger.info("Location findall");
		return locations;
	}
	

	
}
