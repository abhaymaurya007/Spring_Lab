package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\Spring_Lab\\Problem03\\src\\com\\nt\\cfgs\\applicationContext.xml");
		SeasonFinder sf=(SeasonFinder)ctx.getBean("sf");
		System.out.println(sf.showmonthName());

	}

}
