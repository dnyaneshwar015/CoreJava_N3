package org.tnsif.staticdemo;
//

public class StaticVariable {
private String name;
public static String companyName=" TechnoServe India";


public StaticVariable(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "StaticVariable [name=" + name + "]";
}
}
