package com.fss.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Employee e1=(Employee)ac.getBean("employee");
		System.out.println(e1);

	}

}
