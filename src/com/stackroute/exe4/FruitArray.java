package com.stackroute.exe4;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitArray {
		public static ArrayList<String> fruitUpdate(ArrayList<String> arr, String presentEle, String newEle)
		{
			int index;
			if(!arr.contains(presentEle))
			{
				return null;
			}
			else 
			{
				index = arr.indexOf(presentEle);
				arr.set(index, newEle);	
			}
			return arr;
		}
		
		public static ArrayList<String> clearFruits(ArrayList<String> arr)
		{
			arr.clear();
			return arr;
		}
}
