package eu.h2020.symbiote.smeur.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.h2020.symbiote.cloud.model.data.observation.Location;

/**
* @author PetarKrivic <petar.krivic@fer.hr>
*/
public class Waypoint{

	@JsonProperty
	private Location location;
	
	@JsonProperty
	private String navigationDescription;
	
	public Waypoint() {
		super();
	}

	public Waypoint(Location location, String navigationDescription) {
		super();
		this.location = location;
		this.navigationDescription = navigationDescription;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String getNavigationDescription() {
		return navigationDescription;
	}
	
	public void setNavigationDescription(String navigationDescription) {
		this.navigationDescription = navigationDescription;
	}
	
}
