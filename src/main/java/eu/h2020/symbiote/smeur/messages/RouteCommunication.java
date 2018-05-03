package eu.h2020.symbiote.smeur.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import eu.h2020.symbiote.model.cim.WGS84Location;

public class RouteCommunication {
	
	private WGS84Location location;
	private int routeId;
	private long timestamp;
	
	public RouteCommunication() {		
	}
	
	@JsonCreator
	public RouteCommunication(@JsonProperty(value = "location", required = true)WGS84Location location, @JsonProperty(value = "routeId", required = true)int routeId, @JsonProperty(value = "timestamp", required = true)long timestamp) {
		this.location = location;
		this.routeId = routeId;
		this.timestamp = timestamp;
	}

	public WGS84Location getLocation() {
		return location;
	}

	public void setLocation(WGS84Location location) {
		this.location = location;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
