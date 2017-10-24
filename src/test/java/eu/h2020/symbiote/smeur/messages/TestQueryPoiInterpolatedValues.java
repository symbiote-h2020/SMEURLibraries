package eu.h2020.symbiote.smeur.messages;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.model.cim.ObservationValue;
import eu.h2020.symbiote.model.cim.Property;
import eu.h2020.symbiote.model.cim.UnitOfMeasurement;
import eu.h2020.symbiote.model.cim.WGS84Location;

public class TestQueryPoiInterpolatedValues {

	public List<String> asList(String s) {
		return Arrays.asList(new String[] {s});
	}
	
	@Test
	public void testJSON() throws IOException {
		
		WGS84Location loc=new WGS84Location(1.0, 2.0, 3.0, "S1", asList("S2"));
		Map<String, WGS84Location> thePoints=new HashMap<String, WGS84Location>();
		
		thePoints.put("L1", loc);
		
		QueryPoiInterpolatedValues qpiv=new QueryPoiInterpolatedValues(thePoints);
		

		ObservationValue obsValue=new ObservationValue("value", new Property("P1", asList("P2")), new UnitOfMeasurement("m3", "cubemeter", asList("a whole lot")));
		
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(qpiv);
		QueryPoiInterpolatedValues qpiv2=mapper.readValue(json, QueryPoiInterpolatedValues.class);

		assertTrue(qpiv.equals(qpiv2));

	}

}
