package com.dhl.loops;

public class Demo1 {

	public static void main(String[] args) {
		
		
		int[] numbers= {12,883,343,33,344};
		
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<100)
			{
				System.out.println(numbers[i]);
			}
			
		}

//		System.out.println(numbers.length);
		
		for(int val : numbers)
		{
			System.out.println(val);
		}
	}

}
