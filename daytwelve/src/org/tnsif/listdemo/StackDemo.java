package org.tnsif.listdemo;
import java.util.List;
import java.util.Stack;
//program to demonstrate on Stack data structure

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Dnyaneshwar");//push is add element
		obj.push("Ruchita");
		obj.push("Bhushan");
		obj.push("Shruti");
		System.out.println("The elements inside the stack "
				+ "are: "+obj);
		
		obj.pop();//delete element
		System.out.println("The elements inside the stack "
				+ "are: "+obj);
	}
}