package com.stackroute.exe4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapBoolean {
	public static Map<String,Boolean> mapCheck(String[] str)
	{
		int count;
		HashMap<String,Boolean> countMap = new HashMap<String,Boolean>();
		String[] checked = new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			count = 0;
			if(Arrays.asList(checked).contains(str[i]))
			{
				continue;
			}
			for(int j=i;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
						{
					count++;
					checked[j]=str[j];
						}
			}
			if(count>1)
			{
				countMap.put(str[i],true);
			}
			else
			{
				countMap.put(str[i],false);
			}
		}
//		 for(Map.Entry entry: countMap.entrySet())
//		 {
//	      System.out.println("keys : " + entry.getKey() +" corresponding to value in hash table:  "+ entry.getValue());
//		 }
		return countMap;
	}
}
