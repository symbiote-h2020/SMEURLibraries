package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.model.cim.WGS84Location;

public class TestStreetSegmentList {

	@Test
	public void testEquals() {
		StreetSegmentList ssl1=new StreetSegmentList();
		StreetSegment s1=new StreetSegment();	// Master
		s1.id="ID1";
		s1.comment="Comment 1";
		s1.segmentData=new WGS84Location[] {new WGS84Location(1.0, 2.0, 0.0, null, null), new WGS84Location(3.0, 4.0, 0.0, null, null)};
		ssl1.put("Key1", s1);

		
		
		StreetSegmentList ssl2=new StreetSegmentList();
		StreetSegment s2=new StreetSegment();	// Different in ID
		s2.id="ID2";
		s2.comment="Comment 1";
		s2.segmentData=new WGS84Location[] {new WGS84Location(1.0, 2.0, 0.0, null, null), new WGS84Location(3.0, 4.0, 0.0, null, null)};
		ssl2.put("Key1", s2);
		

		StreetSegmentList ssl3=new StreetSegmentList();
		ssl3.put("Key1", s1);

		assertFalse(ssl1.equals(null));
		assertFalse(ssl1.equals("A String"));
		assertFalse(ssl1.equals(ssl2));
		
		assertTrue(ssl1.equals(ssl3));
	}

	
	@Test
	public void testJSON() throws IOException {
		StreetSegmentList ssl1=new StreetSegmentList();
		StreetSegment s1=new StreetSegment();	// Master
		s1.id="ID1";
		s1.comment="Comment 1";
		s1.segmentData=new WGS84Location[] {new WGS84Location(1.0, 2.0, 0.0, null, null), new WGS84Location(3.0, 4.0,0.0, null, null)};
		ssl1.put("Key1", s1);

		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(ssl1);
		StreetSegmentList ssl2=mapper.readValue(json, StreetSegmentList.class);

		assertTrue(ssl1.equals(ssl2));

	}


}
