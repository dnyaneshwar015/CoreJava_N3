package org.tnsif.annotations;

class DeprecatedDemo
{
	@Deprecated
	//Deprecated method is used unimportant method, fields etc.
	public void display() {
		System.out.println("Deprecated annotation: ");
	}
}





public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();
	}

}
