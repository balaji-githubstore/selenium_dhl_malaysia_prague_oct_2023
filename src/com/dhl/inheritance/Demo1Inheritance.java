package com.dhl.inheritance;


class Father
{
	public int fAge=60;
	
	public Father(int f)
	{
		System.out.println("father constructor");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style!!!");
	}
}

class Son extends Father
{
	public int sAge=20;
	public Son(int f,int s)
	{
		super(f);
		System.out.println("Son constructor");
	}
	
	public void sonStyle()
	{
		System.out.println("Son Style!!");
	}
}

public class Demo1Inheritance {

	public static void main(String[] args) {
		
		Son son=new Son(60, 20);
		System.out.println(son.fAge);
		System.out.println(son.sAge);
		
		son.fatherStyle();
		son.sonStyle();
	}

}
