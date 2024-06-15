package com.pes3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab3 {
	public static void main(String[] args)
	{
		ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);
				//A a=(A) ctx.getBean("Maya");
				//a.show();
				//B b=(B) ctx.getBean("Nidhi");
				//b.show();
				Hello c=(Hello) ctx.getBean("Usha");
				c.show();
	}
}
