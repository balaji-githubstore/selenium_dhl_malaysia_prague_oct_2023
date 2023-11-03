package com.dhl.collections;

import java.util.ArrayList;

public class Demo2ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> colors=new ArrayList<Integer>();
		
		colors.add(10);
		
		colors.add(33);
		colors.add(44);
		colors.add(55);
		
		System.out.println(colors);
		
		System.out.println(colors.size());
		
		System.out.println(colors.get(0));
		
		colors.remove(0);
		
		System.out.println(colors);
		
		for(int x : colors)
		{
			System.out.println(x);
		}
		
	}

}
