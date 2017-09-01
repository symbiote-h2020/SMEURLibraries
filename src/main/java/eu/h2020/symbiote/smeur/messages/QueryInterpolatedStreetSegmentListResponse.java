package eu.h2020.symbiote.smeur.messages;

import eu.h2020.symbiote.smeur.StreetSegmentList;

public class QueryInterpolatedStreetSegmentListResponse {
	
	public enum StatusCode {
		SUCCESS,		// You can guess?
		UNKNOWN_SSLID,	// what about his?
		TRY_LATER,		// Currently no interpolated data is available. But it's worth to try later.
		ERROR			// Something unexcepted happened.
	};
	
	public StatusCode status;
	public String explanation;	// Some human readable text to explain in case an error has occured.

	public StreetSegmentList theList;	// Only filled on success.
								// Note that not all fields of the segments are filled even on success.
	
}
