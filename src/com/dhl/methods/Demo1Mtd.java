package com.dhl.methods;

import com.dhl.formulae.Area;

public class Demo1Mtd {


	public static void main(String[] args) {

		int radius = 10;
		
		Area obj=new Area();
		
		double output= obj.areaOfCircle(10);
		System.out.println(output);
		 
		double output1= Area.areaOfRectangle(10, 10.2);
		System.out.println(output1);

		System.out.println(Area.areaOfRectangle(20, 20));
		
		System.out.println(Area.areaOfTriangle(25,1));
		
		
		String name=obj.getAuthorName();
		System.out.println(name);
		
		obj.quit();
	}
}
