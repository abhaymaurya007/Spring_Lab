package com.nt.components;

public class BlueDart implements Courier {

	@Override
	public void deleiver(int oid) {
		System.out.println("BlueDart.deleiver()"+oid);

	}

}
