package org.tnsif.encapsulationdemo;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a pin: ");
				HDFC h=new HDFC();
				h.setPin(sc.nextInt());
				System.out.println(h.getPin());
				h.accept();
				
						
		/*
			HDFC h=new HDFC();
			h.setPin(9696);
			System.out.println(h.getPin());
			h.accept();
		*/
			}

		}
