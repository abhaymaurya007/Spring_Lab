package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMassageGenrator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\Spring_Lab\\Problem02\\src\\com\\nt\\cfgs\\applicationContext.xml");
		WishMassageGenrator genrator=(WishMassageGenrator)ctx.getBean("wmg");
		System.out.println(genrator.showWishMassage(" raja"));
		genrator.showSeasonName();
	}

}
