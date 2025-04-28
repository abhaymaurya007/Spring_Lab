package com.nt.components;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	//buiseness method
	public String Shopping(String items[],Double prices[]) {
		Double tot=0D;
		for(Double f:prices) {
			
			
			tot=tot+f;
		}
		int oid=new Random().nextInt(1000);
		courier.deleiver(oid);
		return Arrays.toString(items)+"items bill Amount"+tot;
		
		
		
	}
	

}
