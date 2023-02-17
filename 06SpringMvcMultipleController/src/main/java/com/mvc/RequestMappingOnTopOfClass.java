package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
//Request mapping annotation at class level
public class RequestMappingOnTopOfClass {
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView test1() {
		ModelAndView mav = new ModelAndView("action");
		String sc = "I am inside RequestMappingOnTopOfClass@test1";
		System.out.println("I am inside RequestMappingOnTopOfClass@test1");
		mav.addObject("ac", sc);
		return mav;
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public ModelAndView test2() {
		ModelAndView mav = new ModelAndView("action");
		String sc = "I am inside RequestMappingOnTopOfClass@test2";
		System.out.println("I am inside RequestMappingOnTopOfClass@test2");
		mav.addObject("ac", sc);
		return mav;
	}

	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public ModelAndView test3() {
		ModelAndView mav = new ModelAndView("action");
		String sc = "I am inside RequestMappingOnTopOfClass@test3";
		System.out.println("I am inside RequestMappingOnTopOfClass@test3");
		mav.addObject("ac", sc);
		return mav;
	}
}
