package org.tnsif.annotations;

import java.util.Scanner;

public class SupressWarningDemo {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	//this annotation is used to remove the warning which occur at the compile time
	int a=sc.nextInt();
	System.out.println(a);

	}

}
