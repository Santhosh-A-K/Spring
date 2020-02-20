package com.fss;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddress {
	public static void main(String args[])
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDAO e = (EmployeeDAO)app.getBean("emp");
		Employee e1 = new Employee(1234,"karthik",001);
		//e.createTable();
		e.saveRecord(e1);
		List<Employee> li=e.readAllRecords();
		for(Employee emp:li)
		{
			System.out.println(emp);
		}
		
		
		
	}

}
