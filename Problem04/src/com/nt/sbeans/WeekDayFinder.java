package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	//hi brother
	@Autowired
	private LocalDate date;

	public WeekDayFinder() {
	
		System.out.println("WeekDayFinder.WeekDayFinder()");
	}
	public void showWishMassageGenrator(String user) {
		int wno=date.getDayOfWeek().getValue();
		System.out.println("your wish massage :"+wno+user);
		
		
	}
	

}
