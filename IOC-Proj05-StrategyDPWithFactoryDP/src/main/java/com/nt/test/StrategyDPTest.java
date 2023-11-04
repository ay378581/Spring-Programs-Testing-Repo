package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		Flipkart ftkp = FlipkartFactory.getService("bdart");
		String result = ftkp.shopping(new String[] {"shirt","trouser","shoe"}, new float[] {1200.56f,1990.0f,2300.30f});
		System.out.println(result);
	}
}
