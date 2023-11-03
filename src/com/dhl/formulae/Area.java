package com.dhl.formulae;

public class Area {

	public double areaOfCircle(int r) {
		return 3.14 * r * r;
	}
	
	public static double areaOfRectangle(double length,double width)
	{
		return length*width;
	}
	
	public static double areaOfTriangle(double base,double height)
	{
		double res=(base*height)/2;
		return res;
	}
	
	public String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public void quit()
	{
		
	}
	
}
