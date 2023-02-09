package org.tnsif.finalkeyword;

public class FinalMethodExecutor 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Mango m =new Mango();
		m.flavour="MixedFruit";
		m.display();
		m.setPrice(250);
		m.display(m.getPrice());
	}

}
