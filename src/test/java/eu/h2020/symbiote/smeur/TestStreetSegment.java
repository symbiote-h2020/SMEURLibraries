package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.cloud.model.data.observation.Location;

public class TestStreetSegment {

	// A little helper
	protected StreetSegment getFullyDefinedStreetSegment() {
		StreetSegment s=new StreetSegment();	// Master
		s.id="ID1";
		s.comment="Comment 1";
		s.segmentData=new Location[] {new Location(1.0, 2.0, 0.0, null, null), new Location(3.0, 4.0, 0.0, null, null)};
		s.exposure=new HashMap<String, Double>();
		s.exposure.put("NOx", 0.14);

		return s;
	}
	
	@Test
	public void testEquals() {
		
		StreetSegment sMaster=getFullyDefinedStreetSegment();

		// These must fail no matter what
		assertFalse(sMaster.equals(null));
		assertFalse(sMaster.equals("A String"));

		// this should pass 
		StreetSegment s2=getFullyDefinedStreetSegment();	// equal
		assertTrue(sMaster.equals(s2));

		
		s2=getFullyDefinedStreetSegment();	// Different in ID
		s2.id="ID2";
		assertFalse(sMaster.equals(s2));
		s2.id=null;
		assertFalse(sMaster.equals(s2));


		s2=getFullyDefinedStreetSegment();	// Different in comment
		s2.comment="Comment 2";	
		assertFalse(sMaster.equals(s2));
		s2.comment=null;	
		assertFalse(sMaster.equals(s2));

		s2=getFullyDefinedStreetSegment();	// Different in points
		s2.segmentData[0].setLatitude(3.0);
		assertFalse(sMaster.equals(s2));
		s2.segmentData[1]=null;
		assertFalse(sMaster.equals(s2));
		s2.segmentData=null;
		assertFalse(sMaster.equals(s2));

		s2=getFullyDefinedStreetSegment();	// Different in exposure
		s2.exposure.put("NO2", 0.15);	// One more
		assertFalse(sMaster.equals(s2));
		s2.exposure.remove("NOx");		// One other
		assertFalse(sMaster.equals(s2));
		s2.exposure.remove("NO2");
		s2.exposure.put("NOx", 0.15);
		assertFalse(sMaster.equals(s2));
		s2.exposure=null;
		assertFalse(sMaster.equals(s2));
		
		
		

	}

	
	@Test
	public void testJSON() throws IOException {
		StreetSegment s1=new StreetSegment();	// Master
		s1.id="ID1";
		s1.comment="Comment 1";
		s1.segmentData=new Location[] {new Location(1.0, 2.0, 0.0, null, null), new Location(3.0, 4.0, 0.0, null, null)};
		s1.exposure=new HashMap<String, Double>();
		s1.exposure.put("NOx", 1.0);	// Use a number here for the tests that can be represented to not run in problems with computer arithmetics!
		
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(s1);
		StreetSegment s2=mapper.readValue(json, StreetSegment.class);

		assertTrue(s1.equals(s2));

	}

}
