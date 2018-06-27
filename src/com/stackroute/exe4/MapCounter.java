package com.stackroute.exe4;

import java.util.HashMap;
import java.util.Map;

public class MapCounter {
	public static Map<String,Integer> mapCount(String str)
	{
		HashMap<String,Integer> countMap = new HashMap<String,Integer>();
		String[] check = str.split(" ");
		for(String s:check)
		{
			if(countMap.containsKey(s))
			{
				int count = countMap.get(s);
			    countMap.put(s, count + 1);
			}
			else
			{
				countMap.put(s, 1);
			}
		}
		return countMap;
	}
}

