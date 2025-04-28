package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("V8")
public class V8Engine implements Engine {

	@Override
	public void start() {
		System.out.println("V8Engine.start()");
		

	}

}
