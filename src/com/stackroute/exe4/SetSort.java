package com.stackroute.exe4;

import java.util.*;

public class SetSort {
	public static ArrayList<String> setSorting(Set<String> strSet)
	{
		SortedSet<String> sortSet = new TreeSet<String>(strSet);
		ArrayList<String> ret = new ArrayList<String>(sortSet);
		return ret;
	}
}
