package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart getService(String service)  {
		
		Flipkart ftkp = new Flipkart();
		Courier courier = null;
		if (service.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (service.equalsIgnoreCase("bdart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Service selected ..");

		ftkp.setCourier(courier);

		return ftkp;
	}
}
