package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.stackroute.exe4.SetSort;

public class SetSortTest {

	@Test
	public void testSetSorting() {
		Set<String> sortSet = new HashSet<String>();
		sortSet.add("Harry");
		sortSet.add("Olive");
		sortSet.add("Alice");
		sortSet.add("Bluto");
		sortSet.add("Eugene");
		ArrayList<String> ret = new ArrayList<String>();
		ret.add("Alice");
		ret.add("Bluto");
		ret.add("Eugene");
		ret.add("Harry");
		ret.add("Olive");
		assertEquals(ret,SetSort.setSorting(sortSet));
		
	}

}
