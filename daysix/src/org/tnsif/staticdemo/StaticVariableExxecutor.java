package org.tnsif.staticdemo;
//Driver class
public class StaticVariableExxecutor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticVariable s=new StaticVariable(" nia lopez");
		System.out.println(s);
		//use classname.variable to print static
		System.out.println(StaticVariable.companyName);
	}
}
