package com.fss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	List<Customer> li=new ArrayList<Customer>();
	
	@RequestMapping(value="/customer", method = RequestMethod.GET)
	public List<Customer> m1()
	{
		
		for(int i=0;i<5;i++)
		{
			Customer c=new Customer("Santhosh",1+i,"vksdbvn");
			li.add(c);
		}
		
		return li;
	}
	
	@RequestMapping(value="/customer/{custid}", method = RequestMethod.GET)
	public Customer  m2(@PathVariable("custid") int custid)
	{
		for(Customer c:li)
		{
			if(c.getPhoneNumber()==custid)
			{
				return c;
			}
		}
		return null;
	}

}
