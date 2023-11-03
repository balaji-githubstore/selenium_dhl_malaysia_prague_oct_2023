package com.dhl.collections;

import java.util.ArrayList;

public class Demo1ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("red");
		
		colors.add("green");
		colors.add("green");
		colors.add("blue");
		
		System.out.println(colors);
		
		System.out.println(colors.size());
		
		System.out.println(colors.get(0));
		
		colors.remove("green");
		
		System.out.println(colors);
		
		
	}

}
