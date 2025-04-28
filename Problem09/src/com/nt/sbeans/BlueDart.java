package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "delivery by blueDart "+oid+"ornder number Products";
	}

}
