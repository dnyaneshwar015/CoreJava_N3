package org.tnsif.staticdemo;
//parent class

public class StaticMethod 
{
	//data memory
	static private double Salary=454555.76;
	//static method
	static public void display()
	{
		System.out.println("salary is: "+Salary);	
	}

	//getter and setter 
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}

}
