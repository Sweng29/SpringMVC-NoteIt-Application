package com.mant.is.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String indexPage()
	{
		return "home";
	}

}
