package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestStreetSegment {

	@Test
	public void testEquals() {
		StreetSegment s1=new StreetSegment();	// Master
		s1.id="ID1";
		s1.comment="Comment 1";
		s1.segmentData=new Point[] {new Point(1.0, 2.0), new Point(3.0, 4.0)};
		
		StreetSegment s2=new StreetSegment();	// Different in ID
		s2.id="ID2";
		s2.comment="Comment 1";
		s2.segmentData=new Point[] {new Point(1.0, 2.0), new Point(3.0, 4.0)};
		
		StreetSegment s3=new StreetSegment();	// Different in comment
		s3.id="ID1";
		s3.comment="Comment 2";
		s3.segmentData=new Point[] {new Point(1.0, 2.0), new Point(3.0, 4.0)};
		
		StreetSegment s4=new StreetSegment();	// Different in points
		s4.id="ID1";
		s4.comment="Comment 1";
		s4.segmentData=new Point[] {new Point(2.0, 2.0), new Point(3.0, 4.0)};
		
		StreetSegment s5=new StreetSegment();	// equal
		s5.id="ID1";
		s5.comment="Comment 1";
		s5.segmentData=new Point[] {new Point(1.0, 2.0), new Point(3.0, 4.0)};
		
		
		
		assertFalse(s1.equals(null));
		assertFalse(s1.equals("A String"));
		assertFalse(s1.equals(s2));
		assertFalse(s1.equals(s3));
		assertFalse(s1.equals(s4));
		
		assertTrue(s1.equals(s5));
	}

	
	@Test
	public void testJSON() throws IOException {
		StreetSegment s1=new StreetSegment();	// Master
		s1.id="ID1";
		s1.comment="Comment 1";
		s1.segmentData=new Point[] {new Point(1.0, 2.0), new Point(3.0, 4.0)};
		
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(s1);
		StreetSegment s2=mapper.readValue(json, StreetSegment.class);

		assertTrue(s1.equals(s2));

	}

}
