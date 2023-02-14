package org.tnsif.arraysdemo;
import java.util.Scanner;

//to demonstrate on array object 
public class ArrayObjectDemo {

	public static void main(String[] args) {
		Student arr[];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements "
				+ "in the array");
		int n=s.nextInt();
		arr=new Student[n];
		int i=0;
		while(i<n)
		{
			arr[i]=new Student(s.nextInt(),s.next(),s.nextFloat());
			i++;
		}
		System.out.println("Student data: ");
		for(int j=0;j<n;j++)
		{
		System.out.println(arr[j].getRollno()+" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
	}

}




/* OUTPUT
 * Enter the no.of elements in the array
2
11 dnyaneshwar 70
12 bhushan 70
Student data: 
11 dnyaneshwar 70.0
12 bhushan 70.0
*/

