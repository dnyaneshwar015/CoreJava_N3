package org.tnsif.staticdemo;
//driver class
public class StaticMethodExecutor 
{

	public static void main(String[] args) 
	{
		//with creating object to print value
		// TODO Auto-generated method stub
		//StaticMethod sm=new StaticMethod();
		//sm.setSalary(79999.69);
		//sm.display();
		
		StaticMethod.display();//without creating object to print value
	}

}

/*OUTPUT
  salary is: 454555.76
*/