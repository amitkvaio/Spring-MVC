package com.mvc;

import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistrationController {
	
	@RequestMapping(value = "/regi", method = RequestMethod.GET)
	public ModelAndView getRegistrationForm() {
		System.out.println("From  RegistrationController@getRegistrationForm");
		ModelAndView mav = new ModelAndView("regForm");
		return mav;
	}
	
	@RequestMapping(value="/regSubmit1", method= RequestMethod.POST)
	public ModelAndView submitForm(
					@RequestParam("fname")String fname,
					@RequestParam("lastname") String lastname,
					@RequestParam("fathername")String fathername,
					@RequestParam("age")String age,
					@RequestParam("add")String address)
	{
		System.out.println("From  RegistrationController@submitForm");
		ModelAndView mav = new  ModelAndView("regSuccess");
		mav.addObject("fname", fname);
		mav.addObject("lname", lastname);
		mav.addObject("fathername", fathername);
		mav.addObject("age", age);
		mav.addObject("address", address);
		return mav;
	}
	
	@RequestMapping(value = "/regSubmit", method = RequestMethod.POST)
	public ModelAndView submitForm1(@RequestParam Map<String, String> req) {
		System.out.println("From  RegistrationController@submitForm1");
		ModelAndView mav = new ModelAndView("regSuccess");

		String fname = req.get("fname");
		String lastname = req.get("lastname");
		String fathername = req.get("fathername");
		String age = req.get("age");
		String address = req.get("add");

		mav.addObject("fname", fname);
		mav.addObject("lname", lastname);
		mav.addObject("fathername", fathername);
		mav.addObject("age", age);
		mav.addObject("address", address);
		return mav;
	}
}
