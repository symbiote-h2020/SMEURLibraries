package eu.h2020.symbiote.smeur.messages;

import java.util.Map;
import java.util.Objects;

import eu.h2020.symbiote.cloud.model.data.observation.Location;

public class QueryPoiInterpolatedValues {
	
	public Map<String, Location> thePoints;	// The strings are used as IDs for the points and will re-occur in the response.
											// You can use human readable IDs to easy debugging,
											// The interpolator will not interpret the IDs at all.

	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("A ").append(QueryPoiInterpolatedValues.class.getTypeName()).append("\n");
		buffer.append("The points queried are").append(thePoints);
		
		return buffer.toString();
	}


	public QueryPoiInterpolatedValues(Map<String, Location> thePoints) {
												super();
												this.thePoints = thePoints;
											}


	public QueryPoiInterpolatedValues() {
	}


	public Map<String, Location> getThePoints() {
		return thePoints;
	}


	public void setThePoints(Map<String, Location> thePoints) {
		this.thePoints = thePoints;
	}
	
	
	public boolean equals(Object o) {
		
		if (this==o)
			return true;
		
		if (o==null)
			return false;
		
		if ( ! (o instanceof QueryPoiInterpolatedValues) )
			return false;
		
		QueryPoiInterpolatedValues oq=(QueryPoiInterpolatedValues)o;
		
		if (!Objects.equals(this.thePoints, oq.thePoints))
			return false;
		
		return true;
	}
}
