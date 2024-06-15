package com.pes3;

public class A {
	private int a;
	private String message;

	public int getA() {
		return a;
	}
	public A()
	{
		System.out.println("default constructor A");
	}
	public void setA(int a) {
		this.a = a;
		System.out.println("A class setter for A");
	}

	public A(int a,String message)
	{
		System.out.println("Constructor is excecuted");
	}
	public String getMessage() {
		System.out.println("A class setter for message");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void show() {
		System.out.println("A show methods ");
		System.out.println(a);
		System.out.println(message);
	}
}
