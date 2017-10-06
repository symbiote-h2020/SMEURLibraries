package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.cloud.model.data.observation.ObservationValue;
import eu.h2020.symbiote.cloud.model.data.observation.Property;
import eu.h2020.symbiote.cloud.model.data.observation.UnitOfMeasurement;
import eu.h2020.symbiote.smeur.messages.PoIInformation;


public class TestPoIInformation {

	@Test
	public void testJSON() throws IOException {
		PoIInformation poii=new PoIInformation();

		ObservationValue obsValue=new ObservationValue("value", new Property("P1", "P2"), new UnitOfMeasurement("m3", "cubemeter", "a whole lot"));
		
		poii.interpolatedValues=new HashMap<String, ObservationValue>();
		poii.interpolatedValues.put("K1", obsValue);
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(poii);
		PoIInformation poii2=mapper.readValue(json, PoIInformation.class);

		assertTrue(poii.equals(poii2));

	}

}
