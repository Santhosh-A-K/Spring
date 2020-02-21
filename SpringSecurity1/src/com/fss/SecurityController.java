package com.fss;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {

	@RequestMapping(value="public", method=RequestMethod.GET)
	public String publicPage()
	{
		return "public";
	}
	
	@RequestMapping(value="private", method=RequestMethod.GET)
	public String privatePage(Principal principal,ModelMap map)
	{
		String msg="Hello "+principal.getName();
		map.addAttribute("msg",msg);
		return "private";
	}
}