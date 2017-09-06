package eu.h2020.symbiote.smeur.messages;

import eu.h2020.symbiote.smeur.StreetSegmentList;

/**
 * 
 * @author DuennebeilG
 * Register a region for interpolation.
 * Needs a list of street segments. This list is forwarded here.
 */
public class RegisterRegion {
	public String regionID; 	// The ID must be unique system wide (required). 
								// The ID should be human readable (for debugging, recommended).
								// The ID is used to route back interpolated values to the consumer.
	
	public StreetSegmentList streetSegments;
	
	// We also need a list of observedproperties here.
}
