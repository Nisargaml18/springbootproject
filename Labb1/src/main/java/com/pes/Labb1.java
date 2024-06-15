package com.pes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Labb1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("pes.xml");
		System.out.println("spring container ready");
		//A a=(A) ctx.getBean("aobj");
		//A b=(A) ctx.getBean("aobj");
		 //System.out.println(a==b);
		 //a.show();
		//B c=(B) ctx.getBean("bobj");
		//c.show();
	//	SingleTon d=(SingleTon) ctx.getBean("bobj");
	}

}