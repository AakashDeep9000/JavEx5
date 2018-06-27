package com.stackroute.exe4;

import java.util.*;

public class MapModifier {
	public static Map<String,String> mapModify(Map<String,String> map)
	{
		if(!(map.get("Val1").isEmpty()))
		{
			map.put("Val2",map.get("Val1"));
			map.put("Val1","");
		}
		return map;
	}

}
