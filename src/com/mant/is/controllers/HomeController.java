package com.mant.is.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mant.is.models.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String indexPage()
	{
		return "home";
	}
	
	@RequestMapping(value="/employeeForm")
	public String employeeForm(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "employee-form";
	}
	
}
