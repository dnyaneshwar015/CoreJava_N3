package org.tnsif.staticdemo;

public class StaticBlock 
{
	//non-static variable
	private int num;
	//static variable
	private static String Name;
	
	//static block 
	/*Static block is used to initialize static variable*/
		static 
		{
			Name="Dnyaneshwar";
		}
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public static String getName() {
		return Name;
	}



	public static void setName(String name) {
		StaticBlock.Name = name;
	}


}
