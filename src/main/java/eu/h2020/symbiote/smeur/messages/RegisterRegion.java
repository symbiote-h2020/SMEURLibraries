package eu.h2020.symbiote.smeur.messages;

import java.util.Set;

import eu.h2020.symbiote.cloud.model.data.observation.Property;
import eu.h2020.symbiote.smeur.StreetSegmentList;

/**
 * 
 * @author DuennebeilG
 * Register a region for interpolation.
 * Needs a list of street segments. This list is forwarded here.
 */
public class RegisterRegion {
	public String regionID; 	// The ID must be unique system wide (required). 
								// The ID should be human readable (for debugging, recommended).
								// The ID is used to route back interpolated values to the consumer.
	
	public StreetSegmentList streetSegments;
	public Set<Property> properties;		// Mention observedProperties here that you want to have interpolated
											// This set is forwarded to the ResourceManager
	
	public boolean yPushInterpolatedValues;	// If set to true, every time a new set of interpolated 
											// values is available, they are pushed to the GRC
	
	
	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		buffer.append("A RegisterRegion message with:\n");
		buffer.append("RegionID=").append(regionID).append("\n");
		buffer.append("streetSegmentList=").append(streetSegments).append("\n");
		buffer.append("Properties are ").append(properties).append("\n");
		buffer.append("Pushing for interploated values is ").append(this.yPushInterpolatedValues);
		
		return buffer.toString();
		
	}
}
