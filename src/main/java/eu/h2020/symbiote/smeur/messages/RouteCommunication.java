package eu.h2020.symbiote.smeur.messages;

import eu.h2020.symbiote.model.cim.WGS84Location;

public class RouteCommunication {
	private WGS84Location location;
	private int routeId;
	private long timestamp;
	
	public RouteCommunication() {
		
	}
	
	public RouteCommunication(WGS84Location l, int r, long t) {
		this.location = l;
		this.routeId = r;
		this.timestamp = t;
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