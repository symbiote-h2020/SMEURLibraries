package eu.h2020.symbiote.smeur.messages;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.cloud.model.data.observation.Location;
import eu.h2020.symbiote.cloud.model.data.observation.ObservationValue;
import eu.h2020.symbiote.cloud.model.data.observation.Property;
import eu.h2020.symbiote.cloud.model.data.observation.UnitOfMeasurement;

public class TestQueryPoiInterpolatedValues {

	@Test
	public void testJSON() throws IOException {
		
		Location loc=new Location(1.0, 2.0, 3.0, "S1", "S2");
		Map<String, Location> thePoints=new HashMap<String, Location>();
		
		thePoints.put("L1", loc);
		
		QueryPoiInterpolatedValues qpiv=new QueryPoiInterpolatedValues(thePoints);
		

		ObservationValue obsValue=new ObservationValue("value", new Property("P1", "P2"), new UnitOfMeasurement("m3", "cubemeter", "a whole lot"));
		
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(qpiv);
		QueryPoiInterpolatedValues qpiv2=mapper.readValue(json, QueryPoiInterpolatedValues.class);

		assertTrue(qpiv.equals(qpiv2));

	}

}
