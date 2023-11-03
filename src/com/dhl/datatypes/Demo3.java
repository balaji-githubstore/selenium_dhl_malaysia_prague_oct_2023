package com.dhl.datatypes;

public class Demo3 {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		
		int[] numbers=new int[5]; //5*32 bits 
		
		//numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers[0]);

		double[] arr1=new double[2];
		
		arr1[0]=1.2;
		arr1[1]=1;
		
		//create an array and store - red,green,yellow
		
		String[] colors=new String[3];
		colors[0]="red";
		//colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors);
		System.out.println(colors[1]);
		
	}

}
