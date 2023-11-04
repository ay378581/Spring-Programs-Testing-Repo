package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;

	public Flipkart() {
		System.out.println("0-param Constructor :: Flipkart");
	}
	
	
	public void setCourier(Courier courier) {
		System.out.println("FLipkart SetCourier :: (-) ");
		this.courier = courier;
	}


	public String shopping(String[] items , float[] prices) {
		float billAmt = 0;
		
		for(int i  = 0; i < items.length; i++) 
			billAmt+=prices[i];
		
		int oid = new Random().nextInt(10000);
		String status = courier.deliver(oid);
		
		String Finalmsg = Arrays.toString(items)+" are purchaced with prices of "+Arrays.toString(prices)+" .The Generated Bill Amount is : "+billAmt;
		
		return Finalmsg+ " ::: "+status;
	}
}
