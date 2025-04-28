package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StratergyDPTest {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctc=new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart f=ctc.getBean("fpkt",Flipkart.class);
		String s[]= {"laptop","smartphone"};
		  Double d[]= {
				  45.78,4456.67
		  };
		f.Shopping(s, d);
		ctc.close();
	}

}
