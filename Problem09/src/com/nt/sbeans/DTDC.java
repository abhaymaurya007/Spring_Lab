package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements ICourier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "delivery by DTDC "+oid+"ornder number Products";
	}

}
