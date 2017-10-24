package eu.h2020.symbiote.smeur.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.h2020.symbiote.model.cim.WGS84Location;

/**
* @author PetarKrivic <petar.krivic@fer.hr>
*/
public class Waypoint{

	@JsonProperty
	private WGS84Location location;
	
	@JsonProperty
	private String navigationDescription;
	
	public Waypoint() {
		super();
	}

	public Waypoint(WGS84Location location, String navigationDescription) {
		super();
		this.location = location;
		this.navigationDescription = navigationDescription;
	}
	
	public WGS84Location getLocation() {
		return location;
	}
	
	public void setLocation(WGS84Location location) {
		this.location = location;
	}
	
	public String getNavigationDescription() {
		return navigationDescription;
	}
	
	public void setNavigationDescription(String navigationDescription) {
		this.navigationDescription = navigationDescription;
	}
	
}
