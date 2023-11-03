package com.dhl.datatypes;

public class Demo1 {

	public static void main(String[] args) {
		
		byte a=0; //8 bits
		
		short b=0; //16 bits 
		
		int c=100; //32 bits 
		
		//byte 
		//1000*8=8000 bits of memory 
		
		//int 
		//1000*32 bits of memory 
		
		long d=100L; //64 bits
		
		float e=3.14F; //32 bits
		
		double f=1.123456789; //64 bits
		
		System.out.println(e);
		System.out.println(f);
		
		boolean check=true;
		
		char letter='t'; // 16 bits
		
		System.out.println(letter);
		
		//non-predefined datatypes
		String myName="Balaji";  //6*16 bits 
		
		System.out.println(myName);
		
		System.out.println(myName.charAt(5));
		System.out.println(myName.toUpperCase());

	}

}
