package com.pes1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean(name="Maya")
public A createA() {
		A a=new A();
		a.setA(20);
		a.setMessage("hi how are you");
		return a;
	}
	@Bean(name="Nidhi")
	public B createB()
	{
		B b=new B();
		b.setB(9);
		b.setMessage("fine");
		return b;
	}
	@Bean(name="Usha")
	public Hello createHello(A a,B b)
	{
		Hello h=new Hello(b);
		h.setAobj(a);
		return h; 
	}
}
