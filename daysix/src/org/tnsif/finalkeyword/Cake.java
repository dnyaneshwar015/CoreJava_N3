package org.tnsif.finalkeyword;
//program to demonstrate on final method
//parent class
public class Cake 
{
	protected String flavour;
	
	
	
	final void display()
  	{
	System.out.println("The flavour of cake is: "+flavour);
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
}
