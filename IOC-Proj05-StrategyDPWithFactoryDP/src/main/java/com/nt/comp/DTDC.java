package com.nt.comp;

public class DTDC implements Courier {
		
	public DTDC() {
		System.out.println("0-Param Constructor :: DTDC");
	}
	@Override
	public String deliver(int oid) {
		
		return oid+"Order is Delivered by DTDC";
	}

}
