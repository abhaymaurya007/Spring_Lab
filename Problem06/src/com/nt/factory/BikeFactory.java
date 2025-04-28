package com.nt.factory;

import com.nt.components.Bike;
import com.nt.components.BulletBike;
import com.nt.components.ElectricBike;
import com.nt.components.SportBike;
import com.nt.components.StandardBike;

public class BikeFactory {
	public static Bike OrderBoke(String type) {
		Bike b=null;
		if(type.equalsIgnoreCase("standard")) {
			b=new StandardBike();
			}
			else if(type.equalsIgnoreCase("electric")) {
				b=new ElectricBike();
				
			}
				else if(type.equalsIgnoreCase("Bullet")) {
					b=new BulletBike();
					
				}else if(type.equalsIgnoreCase("standard")) {
					b=new StandardBike();
					}
					else if(type.equalsIgnoreCase("Sports")) {
						b=new SportBike();
						
					}
						else
							throw new IllegalArgumentException("invalid bike type ");
		           
	                 	return b;
					
						
				}
}	
				

		
		
		
		
	
	
	

