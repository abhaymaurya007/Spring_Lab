package com.nt.factory;

import com.nt.components.BlueDart;
import com.nt.components.Courier;
import com.nt.components.DTDC;
import com.nt.components.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstanFlipkart(String CourierType) {
		
		Courier c=null;
		if(CourierType.equalsIgnoreCase("dtdc")) {
			
			c=new DTDC();
		}
		else if(CourierType.equalsIgnoreCase("blueDart")) {
			
			c=new BlueDart();
		}
		else
			throw new IllegalArgumentException("invalid courier type");
		Flipkart f=new Flipkart();
		f.setCourier(c);
		return f;
		
	}
	

}
