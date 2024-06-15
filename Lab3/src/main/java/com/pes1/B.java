package com.pes1;

public class B {
	private int b;
	private String message;
	
public B(int a,String message) 
{
		System.out.println("constructor B");
	}
public B()
{
	System.out.println("default constructor B");
}
public int getB(int b)
{
	return b;
}
public void setB(int b) {
	this.b = b;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public void show() {
	System.out.println("B show methods ");
	System.out.println("b="+b);
	System.out.println("message="+message);
}
}
