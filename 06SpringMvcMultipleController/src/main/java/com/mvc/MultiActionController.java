package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiActionController {

	@RequestMapping(value = "/action", method = RequestMethod.GET)
	public ModelAndView action() {
		System.out.println("-------action---------");
		ModelAndView mav = new ModelAndView("action");
		String ac = "I am in MultiActionController@action";
		mav.addObject("ac", ac);
		return mav;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test() {
		System.out.println("-------test---------");
		ModelAndView mav = new ModelAndView("action");
		String ac = "I am in MultiActionController@test";
		mav.addObject("ac", ac);
		return mav;
	}

	@RequestMapping(value = "/mum", method = RequestMethod.GET)
	public ModelAndView mum() {
		System.out.println("-------mum---------");
		ModelAndView mav = new ModelAndView("action");
		String ac = "I am in MultiActionController@mum";
		mav.addObject("ac", ac);
		return mav;
	}
}
