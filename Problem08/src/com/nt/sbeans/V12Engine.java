package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("V12")
public class V12Engine implements Engine {

	@Override
	public void start() {
		System.out.println("V12Engine.start()");
		

	}

}
