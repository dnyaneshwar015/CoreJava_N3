package org.tnsif.loopingstatement;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(i+" ");//Increment number 1 to n
			
		}
		System.out.println();
		for(int i=n; i>=1; i--)
		{
			System.out.println(i+" ");//decrement order number n to 1
		}
	}

}
