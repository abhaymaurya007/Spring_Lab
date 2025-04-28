package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
  private LocalDate date;
@Autowired
public void setDate(LocalDate date) {
	this.date = date;
}
  public int showmonthName() {
	  int month=date.getMonthValue();
	 
	  return month;
  }
  
}
