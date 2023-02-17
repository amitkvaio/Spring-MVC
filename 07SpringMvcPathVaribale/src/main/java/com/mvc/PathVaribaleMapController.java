package com.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVaribaleMapController {
	@RequestMapping(value = "/path/{countryName}/{username}", method = RequestMethod.GET)
	public ModelAndView variable(@PathVariable Map<String, String> path) {
		String conName = path.get("countryName");
		String userName = path.get("username");
		ModelAndView mav = new ModelAndView("map");
		mav.addObject("conName", conName);
		mav.addObject("userName", userName);
		return mav;
	}
}
