package com.nt.main;

import java.util.Arrays;

import com.nt.components.Demo;

public class ClassInformationTest {

	public static void main(String[] args) {
	Class<Demo> c=Demo.class;
	System.out.println("c obj class name :"+c.getClass());
	System.out.println("c obj data :"+c.toString());
	System.out.println(" class name :"+c.getName());
	System.out.println("Super Class Name :"+c.getSuperclass());
	System.out.println("list of imple interfaces  :"+Arrays.toString(c.getInterfaces()));
	System.out.println("list of methods :"+Arrays.toString(c.getMethods()));
	System.out.println("list of fields :"+Arrays.toString(c.getDeclaredFields()));
	System.out.println("list of Constructor :"+Arrays.toString(c.getConstructors()));
		
		

	}

}
