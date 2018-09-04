package eu.h2020.symbiote.smeur.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
* @author PetarKrivic <petar.krivic@fer.hr>
*/
public class GrcResponse {

	@JsonProperty
	private List<Waypoint> route;
	
	@JsonProperty
	private double distance;
	
	@JsonProperty
	private double travelTime;
	
	@JsonProperty
	private double airQualityRating;
	
	@JsonProperty
	private boolean eco;

	public GrcResponse() {
		super();
	}

	public GrcResponse(List<Waypoint> route, double distance, double travelTime, double airQualityRating, boolean eco) {
		super();
		this.route = route;
		this.distance = distance;
		this.travelTime = travelTime;
		this.airQualityRating = airQualityRating;
		this.eco = eco;
	}
	
	public GrcResponse(List<Waypoint> route, double distance, double travelTime, double airQualityRating) {
		super();
		this.route = route;
		this.distance = distance;
		this.travelTime = travelTime;
		this.airQualityRating = airQualityRating;
	}

	public boolean isEco() {
		return eco;
	}

	public void setEco(boolean eco) {
		this.eco = eco;
	}

	public List<Waypoint> getRoute() {
		return route;
	}

	public void setRoute(List<Waypoint> route) {
		this.route = route;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(double travelTime) {
		this.travelTime = travelTime;
	}

	public double getAirQualityRating() {
		return airQualityRating;
	}

	public void setAirQualityRating(double airQualityRating) {
		this.airQualityRating = airQualityRating;
	}
	
}
