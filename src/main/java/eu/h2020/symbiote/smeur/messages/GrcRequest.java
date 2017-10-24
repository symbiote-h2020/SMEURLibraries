package eu.h2020.symbiote.smeur.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.h2020.symbiote.model.cim.Location;
import eu.h2020.symbiote.model.cim.WGS84Location;



/**
* @author PetarKrivic <petar.krivic@fer.hr>
*/
public class GrcRequest {
	
	@JsonProperty
	private WGS84Location from;
	
	@JsonProperty
	private WGS84Location to;
	
	@JsonProperty
	private String transportationMode;
	
	@JsonProperty
	private String optimisationCriteria;
	
	public GrcRequest() {
		super();
	}

	public GrcRequest(WGS84Location from, WGS84Location to, String transportationMode, String optimisationCriteria) {
		super();
		this.from = from;
		this.to = to;
		this.transportationMode = transportationMode;
		this.optimisationCriteria = optimisationCriteria;
	}

	public Location getFrom() {
		return from;
	}

	public void setFrom(WGS84Location from) {
		this.from = from;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(WGS84Location to) {
		this.to = to;
	}

	public String getTransportationMode() {
		return transportationMode;
	}

	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
	}

	public String getOptimisationCriteria() {
		return optimisationCriteria;
	}

	public void setOptimisationCriteria(String optimisationCriteria) {
		this.optimisationCriteria = optimisationCriteria;
	}
	
}
