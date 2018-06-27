package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.stackroute.exe4.MapCounter;

public class MapCounterTest {

	@Test
	public void testMapCount() {
		String str = "one one one two three one three one two";
		HashMap<String,Integer> expec = new HashMap<String,Integer>();
		expec.put("one", 5);
		expec.put("two", 2);
		expec.put("three", 2);
		assertEquals(expec,MapCounter.mapCount(str));
	}

}
