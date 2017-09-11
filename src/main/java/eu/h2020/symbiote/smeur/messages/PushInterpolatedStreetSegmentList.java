package eu.h2020.symbiote.smeur.messages;

import eu.h2020.symbiote.smeur.StreetSegmentList;
/**
 * This message is sent from the ELI to the GRC when new interpolated values are available.
 * @author DuennebeilG
 *
 */
public class PushInterpolatedStreetSegmentList {
	
	public String regionID;					// This is the same ID under which the region was registered.
	public StreetSegmentList theList;		// This is the streetSegmentList with the "exposure" fields filled.

}
