package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.stackroute.exe4.MapBoolean;

public class MapBooleanTest {

	@Test
	public void testMapCheck() {
		String arr[] = {"a","b","c","d","a","c","c"};
		HashMap<String,Boolean> expec = new HashMap<String,Boolean>();
			expec.put("a" ,true);
			expec.put("b" ,false);
			expec.put("c" ,true);
			expec.put("d" ,false);
			assertEquals(expec,MapBoolean.mapCheck(arr));
	}

}
