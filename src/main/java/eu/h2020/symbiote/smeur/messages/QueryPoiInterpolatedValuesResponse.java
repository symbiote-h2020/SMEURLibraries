package eu.h2020.symbiote.smeur.messages;

import java.util.Map;


public class QueryPoiInterpolatedValuesResponse {
	public enum StatusCode {
		OK,
		TRY_AGAIN,
		ERROR
	};
	
	public StatusCode status;
	public String explanation;	// Only set when status is ERROR. Holds human readable explanation
	
	public Map<String, Map<String, PoIInformation>> theData;	// The outer map's key refers to the point IDs from the query.
																// This ID should be identical to the id within the PoIInformation
	
	// TODO: discuss whether the inner key "string" (key to pollutant) can/should be changed to the type "Property".
	// Background: Property has an equals and a hashCode function in the meantime. So it CAN be used as a key.

}
