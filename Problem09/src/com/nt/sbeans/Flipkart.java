package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
     @Autowired
     @Qualifier("bDart")
	private ICourier c;
     public void Shopping (String[]items,Double d[]) {
    	 int oid=new Random().nextInt(1000);
    	 Double tot=0D;
    	 for(Double c:d) {
    		 tot+=c;
    	 }
    	 System.out.println(Arrays.toString(items)+"oid :"+oid+"  tot :  "+tot);
    	 
    	 
     }
	
	
}
