package com.dhl.employees;

public class Employee {

	public int empId;
	public String empName;
	public double empSalary;
	public String empPerformance;
	public static String companyName;
	
	public Employee(int empId)
	{
		this.empId=empId;
		System.out.println("Browser launch");
		System.out.println("Object created");
	}
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Browser launch");
		System.out.println("Object created");
	}
	
	public Employee(String empName,int empId)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Browser launch");
		System.out.println("Object created");
	}

	public Employee(double empId)
	{

	}
	
	public void displayEmployeeDetails() {
		System.out.println("---------------------------");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(empPerformance);
		System.out.println(Employee.companyName);
		System.out.println("--------------------------");
	}

	public void allocateBonus() {
		if (empPerformance.equalsIgnoreCase("a")) {
			empSalary = empSalary + 1000;
		} else if (empPerformance.equalsIgnoreCase("b")) {
			empSalary = empSalary + 500;
		} else {
			empSalary = empSalary + 200;
		}
	}
	
//	public static Employee getEmployeeInstance()
//	{
//		Employee emp=new Employee();
//		return emp;
//	}
//	
//	public static void printEmpDetails(Employee e) 
//	{
//		System.out.println(e.empName);
//		System.out.println(e.empId);
//	}
}
