package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("V6")
public class V6Engine implements Engine {

	@Override
	public void start() {
		System.out.println("V6Engine.start()");
		

	}

}
