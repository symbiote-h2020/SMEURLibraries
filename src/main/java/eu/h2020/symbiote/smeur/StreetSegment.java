package eu.h2020.symbiote.smeur;

import java.util.Arrays;

public class StreetSegment {
	public String id;	// Must be unique.
	public Point[] segmentData;
	public String comment; // Something human readable that might help identify a segment when debugging, e.g. a street name.
	
	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("StreetSegment, id=");
		buffer.append(id);
		buffer.append(", ");
		buffer.append(segmentData==null ? "null" : segmentData.length);
		buffer.append(" entries --> ");
		buffer.append(this.comment);
		
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
		
		return true;
	}
}

