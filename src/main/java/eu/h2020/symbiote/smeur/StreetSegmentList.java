package eu.h2020.symbiote.smeur;

import java.util.HashMap;

/**
 * 
 * @author DuennebeilG
 *
 */
public class StreetSegmentList extends HashMap<String, StreetSegment> {
	
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		buffer.append("StreetSegmentList with ").append(this.size()).append(" entries.");
		
		return buffer.toString();
	}
	
}
