package com.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClickController {
	public ClickController() {
		System.out.println("ClickController()");
	}

	
	@RequestMapping(value = "/click",method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		String message = "Welcome to Spring MVC Using Annotations!!";
		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}
	
	@RequestMapping("/course")
	public ModelAndView courseService(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String st = "This is course.jsp page";

		CourseService cs = new CourseService();
		ArrayList<String> al = cs.getCourse();

		ModelAndView modelAndView = new ModelAndView("course");
		modelAndView.addObject("message", st);
		modelAndView.addObject("arrayList", al);

		return modelAndView;
	}
}
