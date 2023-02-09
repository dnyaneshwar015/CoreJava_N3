package org.tnsif.finalkeyword;
//program to demonstrate 
public class FinalVariable 
{
final static int x=15;
//final float y=3.5f;
	public static void print()
	
	{
		/*we can not change the value of x here
		As x is declared as final*/
		//x=17;
		System.out.println("The value of x is: "+x);
	}
	public static void main(String args[]) {
		FinalVariable.print();
	}
}