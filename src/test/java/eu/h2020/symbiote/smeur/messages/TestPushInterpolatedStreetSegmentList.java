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
import eu.h2020.symbiote.smeur.StreetSegmentList;

public class TestPushInterpolatedStreetSegmentList {

	public List<String> asList(String s) {
		return Arrays.asList(new String[] {s});
	}
	
	@Test
	public void testJSON() throws IOException {
		
		PushInterpolatedStreetSegmentList isl=new PushInterpolatedStreetSegmentList();
		isl.regionID="WhatID";
		isl.theList=new StreetSegmentList();
		
        ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(isl);
		PushInterpolatedStreetSegmentList isl2=mapper.readValue(json, PushInterpolatedStreetSegmentList.class);

//		assertTrue(isl.equals(isl2));

	}

}
