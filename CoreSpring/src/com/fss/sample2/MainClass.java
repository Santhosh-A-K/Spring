package com.fss.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Customer c=(Customer)ac.getBean("customer");
		Customer c1=(Customer)ac.getBean("customer");
		System.out.println(c==c1);
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c);

	}

}
