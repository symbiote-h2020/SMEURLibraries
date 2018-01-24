package eu.h2020.symbiote.smeur;

import java.util.HashMap;
import java.util.Iterator;

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
		
		int elementCount=0;
		
		Iterator<java.util.Map.Entry<String, StreetSegment>> it=this.entrySet().iterator();
		while (it.hasNext() && elementCount<3) {
			buffer.append("\n");
			Entry<String, StreetSegment> entry=it.next();
			String key=entry.getKey();
			StreetSegment value=entry.getValue();
			buffer.append(key).append("=").append(value.toString());
			elementCount++;
		}
		if (elementCount>3)
			buffer.append("\n...");
		
		return buffer.toString();
	}
	
}
