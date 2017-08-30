package eu.h2020.symbiote.smeur.messages;

import eu.h2020.symbiote.smeur.StreetSegmentList;

/**
 * 
 * @author DuennebeilG
 * An interpolation consumer is everything that requires interpolated data.
 * Currently known: Green router calculator, POI search.
 * Maybe the use case from S&C with indoor air quality compared to the outside environment 
 */
public class RegisterInterpolationConsumer {
	String consumerID; 	// This must be unique (required). 
						// This should be human readable (for debugging, recommended).
						// The ID is used to route back interpolated values to the consumer.
	
	StreetSegmentList streetSegments;
	
	// We also need a list of observedproperties here.
}
