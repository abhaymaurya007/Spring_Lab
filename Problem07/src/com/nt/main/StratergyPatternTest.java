package com.nt.main;

import com.nt.components.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratergyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Flipkart f=FlipkartFactory.getInstanFlipkart("dtdc");
	  String s[]= {"laptop","smartphone"};
	  Double d[]= {
			  45.78,4456.67
	  };
	  System.out.println(f.Shopping(s,d));

	}

}
