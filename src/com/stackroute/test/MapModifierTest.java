package com.stackroute.test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

import com.stackroute.exe4.MapModifier;

public class MapModifierTest {

	@Test
	public void testMapModify() {
		Map<String,String> checkMap = new HashMap<String,String>();
		checkMap.put("Val1","Mars");
		checkMap.put("Val2","");
		Map<String,String> expec = new HashMap<String,String>();
		expec.put("Val1","");
		expec.put("Val2","Mars");
		assertEquals(expec,MapModifier.mapModify(checkMap));
	}

}
