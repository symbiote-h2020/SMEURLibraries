package eu.h2020.symbiote.smeur.messages;

import java.util.Map;

import eu.h2020.symbiote.cloud.model.data.observation.ObservationValue;
import eu.h2020.symbiote.smeur.StreetSegment;

/**
 * Container class to hold PoI related information during a response to QueryPoIInterpolatedValues 
 * @author DuennebeilG
 *
 */
public class PoIInformation {
	public String poiID;	// A copy of the PoI-ID as in the request.
							// The same ID is also used in other places so it's redundant.
							// The main purpose of this ID is to have all information bundled.
	
	public String errorReason;	// Usually null. Human readable error message when something went wrong.

	public Map<String, ObservationValue>	interpolatedValues;	
	
	// Information below for error checking, debugging and comparable actions:
	public String regionID;				// The regionID this information was taken from. 
	public StreetSegment theSegment;	// The segment found to be nearest.
}
