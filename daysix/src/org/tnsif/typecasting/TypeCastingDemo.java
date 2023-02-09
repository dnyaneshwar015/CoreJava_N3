package org.tnsif.typecasting;

public class TypeCastingDemo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	//implicit //smallest value to largest value
	int x=15;
	float y=x;
	System.out.println("the value of y is: "+y);

	//Explicit //largest value to smallest value
	double d=12.5;
	long l=(long)d;
	System.out.println("the value of l is: "+l);

	}
}


/*OUTPUT
The value of y is:15.0
The value of l is:12
*/