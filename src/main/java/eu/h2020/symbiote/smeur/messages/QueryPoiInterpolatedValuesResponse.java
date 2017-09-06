package eu.h2020.symbiote.smeur.messages;

import java.util.Map;

public class QueryPoiInterpolatedValuesResponse {
	public enum StatusCode {
		OK,
		TRY_AGAIN,
		ERROR
	};
	
	StatusCode status;
	String explanation;	// Only set when status is ERROR. Holds human readable explanation
	
	Map<String, Map<String, Double>> theData;	// The outer map's key refers to the point IDs from the query.
												// The inner maps's key refers to the Pollutants
	
	// TODO: How do we deal with units?

}
