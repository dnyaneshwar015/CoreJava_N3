package org.tnsif.annotations;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Custom
{
	//abstract method
	//Multi-value annotation
	String print() default "Dnyaneshwar";
	int speed() default 50;
	float salary() default 15000.9f;
	
}
class B
{
	@Custom (print="Hello Guys : I am Dnyaneshwar ",speed=50,salary=15000.9f)
	public void display()
	{
		System.out.println("Hurrah!It's Holiday");
	}
}

public class CustomAnnotationDemo {

	public static void main(String[] args) throws Exception {
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		
		System.out.println(obj.print());
		System.out.println("My Speed is: "+obj.speed());
		System.out.println("My salary is: "+obj.salary());
		
	

	}

}

/*OUTPUT
Hurrah!It's Holiday
Hello Guys : I am Dnyaneshwar 
My Speed is: 50
My salary is: 15000.9
*/