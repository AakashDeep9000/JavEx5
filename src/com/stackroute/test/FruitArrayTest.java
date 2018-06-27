package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.stackroute.exe4.FruitArray;

public class FruitArrayTest {

	@Test 
	public void testFruitUpdate() {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Melon");
		fruits.add("Berry");
		ArrayList<String> expec = new ArrayList<String>();
		expec.add("Kiwi");
		expec.add("Grape");
		expec.add("Melon");
		expec.add("Berry");
		assertEquals(expec,FruitArray.fruitUpdate(fruits, "Apple", "Kiwi"));
		assertEquals(null,FruitArray.fruitUpdate(fruits, "Mango", "pineapple"));
		
	}

	@Test
	public void testClearFruits() {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Melon");
		fruits.add("Berry");
		ArrayList<String> expec = new ArrayList<String>();
		assertEquals(expec,FruitArray.clearFruits(fruits));
	}

}
