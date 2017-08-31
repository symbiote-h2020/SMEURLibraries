package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;


public class TestPoint {

	@Test
	public void testEquals() {
		Point p1=new Point(1.0, 2.0);	// Master
		Point p2=new Point(1.0, 3.0);	// Only one field different
		Point p3=new Point(2.0, 2.0);	// Also just one different
		Point p4=new Point(5.0, 6.0);	// Everything different
		
		Point p5=new Point(1.0, 2.0);
		
		
		assertFalse(p1.equals(null));
		assertFalse(p1.equals("A String"));
		assertFalse(p1.equals(p2));
		assertFalse(p1.equals(p3));
		assertFalse(p1.equals(p4));
		
		assertTrue(p1.equals(p5));
	}

	
	@Test
	public void testJSON() throws IOException {
		Point p1=new Point(1.0, 2.0);
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(p1);
		Point p2=mapper.readValue(json, Point.class);

		assertTrue(p1.equals(p2));

	}
}
