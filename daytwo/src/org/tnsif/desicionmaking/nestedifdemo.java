package org.tnsif.desicionmaking;

import java.util.Scanner;

public class nestedifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  age and weight of a person: ");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=20)
		{
			if (weight<40)
			{
				if(weight<120)
				{
				System.out.println("Eligible for bunjee jumping: ");
				}
				else 
				{
					System.out.println("Etra rope will be added ");
				}
			}
			else 
			{
				System.out.println("Not Eligible for bunjee jumping:");
			}
		}

		else 
		{
			System.out.println(" Not Eligible for bunjee jumping");
		}
	}

}
