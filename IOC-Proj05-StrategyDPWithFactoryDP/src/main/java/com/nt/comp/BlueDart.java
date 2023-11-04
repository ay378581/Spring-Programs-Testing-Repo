package com.nt.comp;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("0-Param Constructor :: BlueDart");
	}
	@Override
	public String deliver(int oid) {
		
		return oid+"Product is Delivered by BlueDart";
	}

}
