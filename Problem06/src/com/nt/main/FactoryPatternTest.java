package com.nt.main;

import com.nt.components.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=BikeFactory.OrderBoke("sports");
		b.drive();
		Bike b1=BikeFactory.OrderBoke("electric");
		b1.drive();
		Bike b2=BikeFactory.OrderBoke("Bullet");
		b2.drive();
		Bike b3=BikeFactory.OrderBoke("standard");
		b3.drive();

	}

}
