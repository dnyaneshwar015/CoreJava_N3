package org.tnsif.assign;

import java.util.Scanner;

public class AssignOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a number :");//123
		int a=sc.nextInt();
		while(a!=0)//condition
		{
			a=a/10;
			count++;
		}
		System.out.println(" the number of digits in the integer are "+count);//3
	}

}

/*OUTPUT:
Enter a number :
123
 the number of digits in the integer are 3
*/