package eu.h2020.symbiote.smeur.messages;

public class QueryInterpolatedStreetSegmentList {
	public String sslID;	// Should be identical to the ID under that the consumer registered.
	
	// TODO: Discuss whether we need more fields here (like "not older than", ...)
	
	@Override
	public String toString() {
		return "A QueryInterpolatedStreetSegmentList request with an ID of "+sslID;
	}
}
