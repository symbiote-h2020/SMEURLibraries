package eu.h2020.symbiote.smeur.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
* @author PetarKrivic <petar.krivic@fer.hr>
*/

public class PoiSearchRequest {

	@JsonProperty("latitude")
	private double latitude;
	
	@JsonProperty("longitude")
	private double longitude;
	
	@JsonProperty("radius")
	private double radius;
	
	@JsonProperty("amenity")
	private String amenity;
	
	public PoiSearchRequest(){
	}
	
	public PoiSearchRequest(double lat, double lon, double r, String amenity){
		this.latitude = lat;
		this.longitude = lon;
		this.radius = r;
		this.amenity = amenity;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getAmenity() {
		return amenity;
	}

	public void setAmenity(String amenity) {
		this.amenity = amenity;
	}
	
	
}
