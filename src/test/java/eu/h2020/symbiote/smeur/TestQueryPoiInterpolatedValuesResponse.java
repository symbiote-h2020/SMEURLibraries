package eu.h2020.symbiote.smeur;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.h2020.symbiote.cloud.model.data.observation.ObservationValue;
import eu.h2020.symbiote.cloud.model.data.observation.Property;
import eu.h2020.symbiote.cloud.model.data.observation.UnitOfMeasurement;
import eu.h2020.symbiote.smeur.messages.PoIInformation;
import eu.h2020.symbiote.smeur.messages.QueryPoiInterpolatedValuesResponse;

public class TestQueryPoiInterpolatedValuesResponse {

	@Test
	public void testJSON() throws IOException {
		QueryPoiInterpolatedValuesResponse qpivr=new QueryPoiInterpolatedValuesResponse();

		ObservationValue obsValue=new ObservationValue("value", new Property("P1", "P2"), new UnitOfMeasurement("m3", "cubemeter", "a whole lot"));
		
		PoIInformation poii=new PoIInformation();
		poii.interpolatedValues=new HashMap<String, ObservationValue>();
		poii.interpolatedValues.put("K1", obsValue);
		
		qpivr.theData=new HashMap<String, PoIInformation>();
		qpivr.theData.put("K2", poii);

        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(qpivr);
		QueryPoiInterpolatedValuesResponse qpivr2=mapper.readValue(json, QueryPoiInterpolatedValuesResponse.class);

		assertTrue(qpivr.equals(qpivr2));

	}

}
