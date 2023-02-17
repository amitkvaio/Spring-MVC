package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableController {
	@RequestMapping(value = "/path/welcome/country/user-name", method = RequestMethod.GET)
	public ModelAndView pathVaribale1() {
		ModelAndView mav = new ModelAndView("path");
		String sc = "You are Welcome to PathVariableController--";
		System.out.println("-------I AM FROM pathVaribale1---------------");
		mav.addObject("ac", sc);
		return mav;
	}

	@RequestMapping(value = "/path/welcome/country/{user-name}", method = RequestMethod.GET)
	public ModelAndView pathVaribale2(@PathVariable("user-name") String name) {
		ModelAndView mav = new ModelAndView("path");
		String sc = name + " You are Welcome to PathVariableController--";
		System.out.println("-------I AM FROM pathVaribale2---------------");
		mav.addObject("ac", sc);
		mav.addObject("name", name);
		return mav;
	}

	@RequestMapping(value = "/path/welcome/{country}/{user-name}", method = RequestMethod.GET)
	public ModelAndView pathVaribale3(@PathVariable("user-name") String name,
			@PathVariable("country") String countryName) {
		ModelAndView mav = new ModelAndView("path");
		String sc = name + ", You are Welcome to  " + countryName;
		System.out.println("-------I AM FROM pathVaribale3---------------");
		mav.addObject("ac", sc);
		mav.addObject("name", name);
		mav.addObject("con", countryName);
		return mav;
	}
}
