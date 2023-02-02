
package org.tnsif.intro;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 char y=sc.next().charAt(0);
 float z=sc.nextFloat();
 String name=sc.next();
 String str=sc.nextLine();
 //double d=sc.nextDouble();

 System.out.println("the value of x is: "+x);
 System.out.println("the value of y is: "+y);
 System.out.println("the value of z is: "+z);
 System.out.println("the value of name is: "+name);
 System.out.println("the value of str is: "+str);
 //System.out.println("the value of d is: "+d);

	}

}
