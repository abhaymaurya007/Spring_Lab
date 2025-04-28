package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		WeekDayFinder finder=(WeekDayFinder)ctx.getBean("wdf",WeekDayFinder.class);
		finder.showWishMassageGenrator("raja");
		ctx.close();
		
		
	}
		

}
