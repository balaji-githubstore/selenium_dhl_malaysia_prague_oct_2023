package com.dhl.variables;
// created by balaji

public class Demo1Var {
	public static int aS=10; //static variable or class variable
	public static int bS=20; 
	
	public int aNS=100; //non-static variable or instance variable 
	public int bNS=200;
	
	public static void main(String[] args) {
		
		Demo1Var.aS=1000;
		
		System.out.println(Demo1Var.aS);
		System.out.println(Demo1Var.bS);
		
		Demo1Var obj1=new Demo1Var(); //instance 1
		
		Demo1Var obj2=new Demo1Var(); //instance 2
		
		
		//System.out.println(obj1);
		//System.out.println(obj2);
		
		obj1.aNS=500;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
	}

}
