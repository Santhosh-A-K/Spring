package com.fss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class SessionController{
 
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView f1()
	{
	Employee e=new Employee();
	ModelAndView mav=new ModelAndView("Form","",e);
	return mav;
	}
	@RequestMapping(value="createSession", method=RequestMethod.GET)
	public String f2(@ModelAttribute Employee emp, HttpServletRequest request)
	{
	HttpSession session=request.getSession(true);
	session.setAttribute("employeeObj",emp);
	return "Page1";
	}
	@RequestMapping(value="Page2", method=RequestMethod.GET)
	public String f3()
	{
	return "Page2";
	}
	@RequestMapping(value="Page1", method=RequestMethod.GET)
	public String f4()
	{
	return "Page1";
	}
	@RequestMapping(value="Logout", method=RequestMethod.GET)
	public String f5(HttpServletRequest request)
	{
	HttpSession session=request.getSession(false);
	String str="";
	if (!session.isNew()) {
	session.invalidate();
	str="Logout";
	}
	return str;
	}

}