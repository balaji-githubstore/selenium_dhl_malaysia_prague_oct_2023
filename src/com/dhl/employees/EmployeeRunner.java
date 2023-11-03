package com.dhl.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee.companyName="DHL";
		
		Employee emp1=new Employee(102.3);
		Employee emp2=new Employee(102,"Bala");
		Employee emp3=new Employee(103);
		Employee emp4=new Employee(104);
		
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
//		Employee emp5= Employee.getEmployeeInstance();
//		Employee emp6= Employee.getEmployeeInstance();
		
		emp1.empId=101;
		emp1.empName="Saul";
		emp1.empSalary=9000;
		emp1.empPerformance="A";
		
		emp2.empId=102;
		emp2.empName="Kim";
		emp2.empSalary=8000;
		emp2.empPerformance="B";
		
		emp3.empId=103;
		emp3.empName="Joe";
		emp3.empSalary=7000;
		emp3.empPerformance="C";
		
		System.out.println("Before bonus!!");
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		emp3.displayEmployeeDetails();
		emp4.displayEmployeeDetails();
		
		System.out.println("After bonus!!");
		
		emp1.allocateBonus();
		emp2.allocateBonus();
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		
		
//		emp5.displayEmployeeDetails();
//		emp6.displayEmployeeDetails();
		
//		Employee.printEmpDetails(emp2);
//		Employee.printEmpDetails(emp3);
	}
}


