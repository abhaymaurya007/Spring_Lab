package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	
	@Autowired
	private LocalDate date;

	public WeekDayFinder() {
	
		System.out.println("WeekDayFinder.WeekDayFinder()");
	}
	
	@Autowired
	public WeekDayFinder(LocalDate date) {
		System.out.println("WeekDayFinder.WeekDayFinder(1)");
	
		this.date = date;
	}


	public LocalDate getDate() {
		return date;
	}

	@Autowired
   	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date = date;
	}


	public void showWishMassageGenrator(String user) {
		int wno=date.getDayOfWeek().getValue();
		System.out.println("your wish massage :"+wno+"    "+user);
		
		
	}
	

}
