package org.tnsif.abstractiondemo;

public class AbstractionExecutor {

	public static void main(String[] args) {
		ButterChiken b=new ButterChiken();
		/*We can't instantiate the abstract class*/
		//Menu m=new Menu();
		
		b.foodType();
		b.menuType();
		b.recipe();

	}

}
/*OUTPUT
 Non-veg
 Veg and Nonveg
 wash and cook a chicken
*/