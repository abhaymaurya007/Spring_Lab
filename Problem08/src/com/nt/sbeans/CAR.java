package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("car")
public final class CAR {
	
	@Autowired
	@Qualifier("V12")
	private Engine engine;
	public void start() {
		engine.start();
	}
	

}
