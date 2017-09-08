package eu.h2020.symbiote.smeur.messages;

import java.util.Map;

import eu.h2020.symbiote.cloud.model.data.observation.Location;

public class QueryPoiInterpolatedValues {
	
	public String regionID;	// Must refer to a previously registered region.
	
	public Map<String, Location> thePoints;	// The strings are used as IDs for the points and will re-occur in the response.
											// You can use human readable IDs to easy debugging,
											// The interpolator will not interpret the IDs at all.
	

}
