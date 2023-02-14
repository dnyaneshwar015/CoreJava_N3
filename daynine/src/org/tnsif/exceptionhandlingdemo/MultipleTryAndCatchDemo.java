package org.tnsif.exceptionhandlingdemo;
//multiple catch create
public class MultipleTryAndCatchDemo {

	public static void main(String[] args) {
			try 
			{
				int[] arr=new int[] {1,2,3};
				System.out.println(arr[3]);
				
			}
			catch(ArithmeticException e) 
			{
					System.out.println("Arithmetic Exception Occurs");
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
					System.out.println("Array Index Out Of Bounds Exception Occurs");
			}
			catch(Exception e) 
			{
					System.out.println("Parent Exception Occurs");
			}
					//System.out.println("Rest of Code");
		}
	}

