package org.tnsif.loopingstatement;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");//Increment number i to n
			i++;
		}
		System.out.println(" ");
		int m=10;
		while(m>=1)
		{
			System.out.print(m+" ");//Increment number m to 1
			m--;
		}
	}

}
