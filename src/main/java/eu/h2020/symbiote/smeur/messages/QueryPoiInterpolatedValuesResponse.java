package eu.h2020.symbiote.smeur.messages;

import java.util.Map;
import java.util.Objects;


public class QueryPoiInterpolatedValuesResponse {
	public enum StatusCode {
		OK,
		TRY_AGAIN,
		ERROR
	};
	
	public StatusCode status;
	public String explanation;	// Only set when status is ERROR. Holds human readable explanation
	
	public Map<String, PoIInformation> theData;	// The outer map's key refers to the point IDs from the query.
																// This ID should be identical to the id within the PoIInformation
	
	// TODO: discuss whether the inner key "string" (key to pollutant) can/should be changed to the type "Property".
	// Background: Property has an equals and a hashCode function in the meantime. So it CAN be used as a key.

	
	public boolean equals(Object o) {
		if (o==this)
			return true;
		
		if (o==null)
			return false;
		
		if ( !(o instanceof QueryPoiInterpolatedValuesResponse) )
			return false;
		
		QueryPoiInterpolatedValuesResponse other=(QueryPoiInterpolatedValuesResponse)o;
		

		if (this.status!=other.status)
			return false;
		
		if (!Objects.equals(this.explanation, other.explanation))
			return false;
		
		if (!Objects.equals(this.theData, other.theData))
			return false;
		
		return true;
	}
	
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("A QueryPoiInterpolatedValuesResponse\n");
		buffer.append("status is:").append(status).append("\n");
		buffer.append("explanation is ").append(explanation).append("\n");
		buffer.append("The payload is: ").append(theData);
		
		return buffer.toString();
	}
	
}
