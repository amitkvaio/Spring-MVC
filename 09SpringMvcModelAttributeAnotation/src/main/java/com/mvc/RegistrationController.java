package com.mvc;

import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistrationController {
	
	@RequestMapping(value = "/regi", method = RequestMethod.GET)
	public ModelAndView getRegistrationForm() {
		System.out.println("From  RegistrationController@getRegistrationForm");
		String message = "Hi,You are most welcome to spring mvc world!!";
		ModelAndView mav = new ModelAndView("regForm");
		mav.addObject("message", message);
		return mav;
	}
	
	@RequestMapping(value="/regSubmit1", method= RequestMethod.POST)
	public ModelAndView submitForm1(
					@RequestParam("fname")String fname,
					@RequestParam("lastname") String lastname,
					@RequestParam("fathername")String fathername,
					@RequestParam("age")String age,
					@RequestParam("add")String address)
	{
		System.out.println("From  RegistrationController@submitForm1");
		
		RegModel reg = new RegModel();
		reg.setFname(fname);
		reg.setLastname(lastname);
		reg.setFathername(fathername);
		reg.setAge(age);
		reg.setAdd(address);
		
		String message = "Hi,You are most welcome to spring mvc world!!";
		ModelAndView mav = new ModelAndView("regSuccess");
		mav.addObject("message", message);
		mav.addObject("reg", reg);
		return mav;
	}
	
	@RequestMapping(value = "/regSubmit2", method = RequestMethod.POST)
	public ModelAndView submitForm2(@RequestParam Map<String, String> req) {
		System.out.println("From  RegistrationController@submitForm2");
		ModelAndView mav = new ModelAndView("regSuccess");
		String message = "Hi,You are most welcome to spring mvc world!!";
		
		RegModel reg = new RegModel();
		reg.setFname(req.get("fname"));
		reg.setLastname(req.get("lastname"));
		reg.setFathername(req.get("fathername"));
		reg.setAge(req.get("age"));
		reg.setAdd(req.get("add"));
		 
		mav.addObject("reg", reg);
		mav.addObject("message", message);
		return mav;
	}
	
	
	@RequestMapping(value = "/regSubmit3", method = RequestMethod.POST)
	public ModelAndView submitForm3(@ModelAttribute("reg") RegModel reg789) {
		System.out.println("From  RegistrationController@submitForm3");
		String message = "Hi,You are most welcome to spring mvc world!!";
		ModelAndView mav = new ModelAndView("regSuccess");
		mav.addObject("message", message);
		return mav;
	}
	
	@ModelAttribute
	public void getMessage(Model model) {
		String message = "Hi,YOU ARE WELCOME IN LARA TECHNOLOGY";
		model.addAttribute("message", message);
	}
}
/*
Annotation that binds a method parameter or method return value to a named model attribute, exposed to a web view.
*/