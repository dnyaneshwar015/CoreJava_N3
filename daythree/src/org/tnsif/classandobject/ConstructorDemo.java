package org.tnsif.classandobject;
import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cust_1
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter id, name,city");
		int id1=sc1.nextInt();
		String cust_name1 = sc1.next();
		String city1=sc1.next();
		
		Customer c1=new Customer();
		c1.setId(id1);
		c1.setCust_name(cust_name1);
		c1.setCity(city1);
		c1.display();

//cust_2
		Scanner sc2=new Scanner (System.in);
		System.out.println("Enter id, name,city");
		int id2=sc2.nextInt();
		String cust_name2 = sc2.next();
		String city2=sc2.next();


		Customer c2=new Customer();
		c2.setId(id2);
		c2.setCust_name(cust_name2);
		c2.setCity(city2);
		c2.display();
	}

}
