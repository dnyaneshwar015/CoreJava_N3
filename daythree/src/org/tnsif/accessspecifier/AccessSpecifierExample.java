package org.tnsif.accessspecifier;

public class AccessSpecifierExample {
/*If any data memory is default is will access only inside the name package*/
	
	
	private String name;
	public void display() 
	{
		System.out.println("The name is:"+name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
