package eu.h2020.symbiote.smeur;

import java.util.Arrays;
import java.util.Map;

import eu.h2020.symbiote.model.cim.ObservationValue;
import eu.h2020.symbiote.model.cim.WGS84Location;



public class StreetSegment {
	public String id;	// Must be unique.
	public WGS84Location[] segmentData;
	public String comment; // Something human readable that might help identify a segment when debugging, e.g. a street name.
	public Map<String, ObservationValue> exposure;	// only used when this is an air quality response.

	
	
	
	
	// TODO: We need to agree on units somehow.
	
	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("StreetSegment, id=");
		buffer.append(id);
		buffer.append(", ");
		buffer.append(segmentData==null ? "null" : segmentData.length);
		buffer.append(" entries.");
		buffer.append(" Comment=").append(this.comment);
		
		return buffer.toString();
	}

	
	@Override
	public boolean equals(Object other) {
		
		if (other==null)
			return false;
		
		if ( ! (other instanceof StreetSegment) )
			return false;
		
		StreetSegment otherSSL=(StreetSegment)other;
		
		if ( (this.id==null && otherSSL.id!=null) || (this.id!=null && otherSSL.id==null) )
			return false;
		
		// Here ids are either both null or both not null.
		if (this.id!=null && !this.id.equals(otherSSL.id))
			return false;

		if ( (this.comment==null && otherSSL.comment!=null) || (this.comment!=null && otherSSL.comment==null) )
			return false;
		
		// Here comments are either both null or both not null.
		if (this.comment!=null && !this.comment.equals(otherSSL.comment))
			return false;

		boolean yPointsAreEqual=Arrays.equals(this.segmentData, otherSSL.segmentData);
		if (!yPointsAreEqual)
			return false;

		if ( (this.exposure==null && otherSSL.exposure!=null) || (this.exposure!=null && otherSSL.exposure==null) )
			return false;
		
		// Here exposures are either both null or both not null.
		if (this.exposure!=null && !this.exposure.equals(otherSSL.exposure))
			return false;

		
		return true;
	}
}

